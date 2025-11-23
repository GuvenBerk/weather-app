package com.example.weather_app.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.client.ResourceAccessException;
import org.springframework.http.ResponseEntity;

@Service
public class WeatherService {

    private final RestTemplate restTemplate = new RestTemplate();
    private final String BASE_URL = "https://api.open-meteo.com/v1/forecast";

    public String getWeather(double latitude, double longitude) {
        try {
            String url = BASE_URL + 
                "?latitude=" + latitude + 
                "&longitude=" + longitude + 
                "&current_weather=true";

            // getForObject yerine getForEntity kullanıyoruz ki status code'u görelim
            ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
            
            // Open-Meteo'dan 5xx hatası gelirse
            if (response.getStatusCode().is5xxServerError()) {
                throw new RuntimeException("Open-Meteo service error");
            }
            
            return response.getBody();
            
        } catch (ResourceAccessException e) {
            // Timeout veya bağlantı hatası
            throw new RuntimeException("Service unavailable - timeout or connection error");
        } catch (Exception e) {
            // Diğer hatalar
            throw new RuntimeException("Error fetching weather data: " + e.getMessage());
        }
    }
}
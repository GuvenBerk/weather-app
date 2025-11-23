package com.example.weather_app.controller;

import com.example.weather_app.service.WeatherService;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;

@RestController
@RequestMapping("/api")
public class WeatherController {

    private final WeatherService weatherService;

    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping("/hello")
    public String sayHello() {
        return "Czesc! API pogodowe dziala!";
    }

    @GetMapping("/weather")
    public ResponseEntity<String> getWeather(@RequestParam double lat, @RequestParam double lon) {
        try {
            // Geçersiz koordinat kontrolü
            if (lat < -90 || lat > 90 || lon < -180 || lon > 180) {
                return ResponseEntity.badRequest()
                    .body("{\"error\": \"Invalid coordinates. Latitude must be between -90 and 90, longitude between -180 and 180\"}");
            }
            
            String weatherData = weatherService.getWeather(lat, lon);
            return ResponseEntity.ok(weatherData);
            
        } catch (RuntimeException e) {
            // Hata türlerine göre farklı HTTP status kodları döndür
            String errorMessage = e.getMessage();
            
            if (errorMessage.contains("unavailable") || errorMessage.contains("timeout")) {
                return ResponseEntity.status(HttpStatus.SERVICE_UNAVAILABLE)
                    .body("{\"error\": \"Weather service is currently unavailable\"}");
            } else if (errorMessage.contains("Open-Meteo service error")) {
                return ResponseEntity.status(HttpStatus.BAD_GATEWAY)
                    .body("{\"error\": \"External weather service error\"}");
            } else {
                return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("{\"error\": \"Internal server error: \" + errorMessage}");
            }
        }
    }
}
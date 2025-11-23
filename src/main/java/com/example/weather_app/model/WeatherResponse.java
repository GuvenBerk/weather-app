package com.example.weather_app.model;

public class WeatherResponse {
    private double temperature;
    private double windspeed;
    private String time;
    private String condition;

    public WeatherResponse(double temperature, double windspeed, String time, String condition) {
        this.temperature = temperature;
        this.windspeed = windspeed;
        this.time = time;
        this.condition = condition;
    }

    public double getTemperature() { return temperature; }
    public double getWindspeed() { return windspeed; }
    public String getTime() { return time; }
    public String getCondition() { return condition; }

    public void setTemperature(double temperature) { this.temperature = temperature; }
    public void setWindspeed(double windspeed) { this.windspeed = windspeed; }
    public void setTime(String time) { this.time = time; }
    public void setCondition(String condition) { this.condition = condition; }
}
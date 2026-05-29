package com.example.weather_app.controller;

import com.example.weather_app.dto.WeatherForeCast;
import com.example.weather_app.dto.WeatherResponse;
import com.example.weather_app.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/weather")
@CrossOrigin
public class Controller {
    @Autowired
    private WeatherService service;

    @GetMapping("/{city}")
    public String getWeatherData(@PathVariable String city)
    {
        return service.test();
    }

    @GetMapping("/my/{city}")
    public WeatherResponse getWeather(@PathVariable String city)
    {
        return service.getData(city);
    }

    @GetMapping("/forecast")
    public WeatherForeCast getForecast(@RequestParam String city, @RequestParam int days)
    {
        return service.getForeCast(city,days);
    }
}
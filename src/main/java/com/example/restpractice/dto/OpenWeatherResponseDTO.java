package com.example.restpractice.dto;

public class OpenWeatherResponseDTO {

    private Main main;

    private Rain rain;
    public Rain getRain() {
        return rain;
    }
    public void setRain(Rain rain) {
        this.rain = rain;
    }
    public Main getMain() {
        return main;
    }
    public void setMain(Main main) {
        this.main = main;
    }

    public OpenWeatherResponseDTO() {
    }
}

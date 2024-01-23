package com.test.citiesapi.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
public class Response {
    @Getter
    private Integer temperature;
    @Getter
    private Integer wind;
    @Getter
    private String description;
    @Getter
    private List<Forecast> forecast;
}
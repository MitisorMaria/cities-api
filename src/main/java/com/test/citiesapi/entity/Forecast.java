package com.test.citiesapi.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
public class Forecast {

    @Getter
    private Integer day;
    @Getter
    private Integer temperature;
    @Getter
    private Integer wind;
}
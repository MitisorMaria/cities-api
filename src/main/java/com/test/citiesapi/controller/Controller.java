package com.test.citiesapi.controller;

import com.test.citiesapi.entity.Forecast;
import com.test.citiesapi.entity.Response;
import com.test.citiesapi.exception.NoCityException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;


@RestController
@RequestMapping("/forecast/{city}")
public class Controller {

    @GetMapping
    public Response getForecast(@PathVariable String city) throws NoCityException {
        // dummy forecast list for testing purposes
        List<Forecast> forecastList = new ArrayList<>();

        List<Forecast> forecastListCluj = new ArrayList<>();
        List<Forecast> forecastListBucuresti = new ArrayList<>();
        List<Forecast> forecastListTimisoara = new ArrayList<>();
        List<Forecast> forecastListConstanta = new ArrayList<>();
        List<Forecast> forecastListBaiaMare = new ArrayList<>();
        List<Forecast> forecastListArad = new ArrayList<>();

        forecastListCluj.add(new Forecast(1, 23, 3));
        forecastListCluj.add(new Forecast(2, 20, 5));
        forecastListCluj.add(new Forecast(3, 14, 10));
        forecastListCluj.add(new Forecast(4, 25, 11));
        forecastListCluj.add(new Forecast(5, 22, 3));
        forecastListCluj.add(new Forecast(6, 21, 1));

        forecastListBucuresti.add(new Forecast(1, 22, 3));
        forecastListBucuresti.add(new Forecast(2, 20, 6));
        forecastListBucuresti.add(new Forecast(3, 16, 16));
        forecastListBucuresti.add(new Forecast(4, 28, 19));
        forecastListBucuresti.add(new Forecast(5, 24, 30));
        forecastListBucuresti.add(new Forecast(6, 20, 12));

        forecastListTimisoara.add(new Forecast(1, 22, 23));
        forecastListTimisoara.add(new Forecast(2, 25, 15));
        forecastListTimisoara.add(new Forecast(3, 19, 20));
        forecastListTimisoara.add(new Forecast(4, 25, 11));
        forecastListTimisoara.add(new Forecast(5, 25, 5));
        forecastListTimisoara.add(new Forecast(6, 22, 3));

        forecastListConstanta.add(new Forecast(1, 25, 3));
        forecastListConstanta.add(new Forecast(2, 27, 5));
        forecastListConstanta.add(new Forecast(3, 29, 0));
        forecastListConstanta.add(new Forecast(4, 35, 1));
        forecastListConstanta.add(new Forecast(5, 32, 3));
        forecastListConstanta.add(new Forecast(6, 31, 1));

        forecastListBaiaMare.add(new Forecast(1, 26, 3));
        forecastListBaiaMare.add(new Forecast(2, 28, 5));
        forecastListBaiaMare.add(new Forecast(3, 22, 4));
        forecastListBaiaMare.add(new Forecast(4, 23, 7));
        forecastListBaiaMare.add(new Forecast(5, 25, 13));
        forecastListBaiaMare.add(new Forecast(6, 21, 12));

        forecastListArad.add(new Forecast(1, 27, 3));
        forecastListArad.add(new Forecast(2, 25, 5));
        forecastListArad.add(new Forecast(3, 13, 35));
        forecastListArad.add(new Forecast(4, 13, 45));
        forecastListArad.add(new Forecast(5, 17, 3));
        forecastListArad.add(new Forecast(6, 20, 10));

        switch (city.toUpperCase(Locale.ROOT)) {
            case "CLUJ-NAPOCA":
                forecastList = forecastListCluj;
                break;
            case "BUCURESTI":
                forecastList = forecastListBucuresti;
                break;
            case "TIMISOARA":
                forecastList = forecastListTimisoara;
                break;
            case "CONSTANTA":
                forecastList = forecastListConstanta;
                break;
            case "BAIA-MARE":
                forecastList = forecastListBaiaMare;
                break;
            case "ARAD":
                forecastList = forecastListArad;
                break;
            default:
                throw new NoCityException();
        }

        return new Response(forecastList);
    }
}
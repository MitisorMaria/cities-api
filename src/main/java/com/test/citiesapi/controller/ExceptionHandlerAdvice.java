package com.test.citiesapi.controller;

import com.test.citiesapi.entity.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.ArrayList;


@RestControllerAdvice
public class ExceptionHandlerAdvice {

    @ExceptionHandler({ Throwable.class })
    public ResponseEntity<Response> handleGenericException(Throwable throwable) {
        return new ResponseEntity<>(new Response(new ArrayList<>()), HttpStatus.NOT_FOUND);
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.parcial.controllers;

import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import edu.eci.arsw.parcial.model.Weather;
import edu.eci.arsw.parcial.services.WeatherServices;

/**
 *
 * @author Michael B
 */
@RestController
@RequestMapping(value = "/weather")
@Service
public class WeatherAPIController {


    @Autowired
    private WeatherServices wthServices;

    private ObjectMapper objectMapper = new ObjectMapper();

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> getCity(){
        try {
            Weather wth2 = new Weather(0, "main", "description", "icon");
            System.out.println(objectToJson(wth2));
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(objectToJson(wth2),HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(WeatherAPIController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("HTTP 404 Not Found",HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value="/{city}", method = RequestMethod.GET)
    public ResponseEntity<?> getWeather(@PathVariable String city){
        try {
            System.out.println(city);
            String json = objectToJson(wthServices.getWeatherCity(city));
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(json,HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(WeatherAPIController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("HTTP 404 Not Found",HttpStatus.NOT_FOUND);
        }
    }

    private String objectToJson(Object a){
        String json = null;
        try {
            json = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(a);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return json;
    }
}

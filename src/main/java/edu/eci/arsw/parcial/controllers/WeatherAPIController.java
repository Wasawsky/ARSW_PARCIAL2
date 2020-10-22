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
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author cristian
 */
@RestController
@RequestMapping(value = "/weather")
public class WeatherAPIController {


    private ObjectMapper objectMapper = new ObjectMapper();

    /*
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> manejadorGetRecursoCinema(){
        try {
            System.out.println(objectToJson(cinemaServices.getAllCinemas()));
            //obtener datos que se enviarán a través del API
            return new ResponseEntity<>(objectToJson(cinemaServices.getAllCinemas()),HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(CinemaAPIController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("HTTP 404 Not Found",HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value="/{name}", method = RequestMethod.POST)
    public ResponseEntity<?> controladorNuevoCinema(@RequestBody String body, @PathVariable String name){
        try {
            JsonNode root = objectMapper.readTree(body);
            Cinema nuevo = objectMapper.readValue(body, Cinema.class);
            if(!name.equals(nuevo.getName())){
                return new ResponseEntity<>("HTTP 403 Forbidden",HttpStatus.FORBIDDEN);
            }
            cinemaServices.addNewCinema(nuevo);
            return new ResponseEntity<>("HTTP 201 Created",HttpStatus.CREATED);
        } catch (IOException ex){
            Logger.getLogger(CinemaAPIController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("HTTP 400 Bad Request",HttpStatus.BAD_REQUEST);
        } catch (CinemaException ex) {
            Logger.getLogger(CinemaAPIController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("HTTP 403 Forbidden",HttpStatus.FORBIDDEN);
        }
    }*/

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

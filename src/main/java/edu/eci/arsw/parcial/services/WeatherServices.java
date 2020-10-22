/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.parcial.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import edu.eci.arsw.parcial.controllers.ResourceNotFoundException;
import edu.eci.arsw.parcial.model.Weather;

/**
 *
 * @author Michael B
 */
@Service
@Scope("prototype")
public interface WeatherServices {

	public Weather getWeatherCity(String city) throws ResourceNotFoundException;
    
}

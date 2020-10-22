/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.parcial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 *
 * @author Michael B
 */
@SpringBootApplication(scanBasePackages={"edu.eci.arsw.parcial.services"})
@ComponentScan(basePackages = {"edu.eci.arsw.parcial"})
public class WeatherAPIApplication {

    public static void main(String[] args) {
        SpringApplication.run(WeatherAPIApplication.class, args);
    }
}

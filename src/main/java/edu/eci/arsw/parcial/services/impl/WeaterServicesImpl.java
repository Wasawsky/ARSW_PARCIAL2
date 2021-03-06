package edu.eci.arsw.parcial.services.impl;

import com.google.gson.*;

import org.springframework.stereotype.Service;

import edu.eci.arsw.parcial.controllers.ResourceNotFoundException;
import edu.eci.arsw.parcial.model.Weather;
import edu.eci.arsw.parcial.services.WeatherServices;
import edu.eci.arsw.parcial.services.http.HttpConnectionExample;

@Service
public class WeaterServicesImpl implements WeatherServices {

    @Override
    public Weather getWeatherCity(String city) throws ResourceNotFoundException {
        // TODO Auto-generated method stub
        Weather wht = new Weather();
        String json = null;
        System.out.println("gettando");
        String url = "http://api.openweathermap.org/data/2.5/weather?q="+city+"&appid=eef1796447aa9216af254cb36e39c2af";
        try {
            json = HttpConnectionExample.getRequest(url);
        } catch (Exception e) {
            //TODO: handle exception
            throw new ResourceNotFoundException();
        }
        System.out.println(json);
        Gson gson = new Gson();
        //wht = gson.fromJson(json, Weather.class);
        return wht;
    }

    public static void main(String[] args) throws ResourceNotFoundException {
        WeatherServices wht = new WeaterServicesImpl();
        System.out.println((wht.getWeatherCity("london")));
        
    }
}

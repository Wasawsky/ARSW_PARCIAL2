package edu.eci.arsw.parcial.services.impl;

import edu.eci.arsw.parcial.controllers.ResourceNotFoundException;
import edu.eci.arsw.parcial.model.Weather;
import edu.eci.arsw.parcial.services.WeatherServices;
import edu.eci.arsw.parcial.services.http.HttpConnectionExample;

public class WeaterServicesImpl implements WeatherServices {

    @Override
    public Weather getWeatherCity(String city) {
        // TODO Auto-generated method stub
        Weather wht = null;
        System.out.println("gettando");
        String url = "http://api.openweathermap.org/data/2.5/weather?q="+city+"&appid=eef1796447aa9216af254cb36e39c2af";
        try {
            HttpConnectionExample.getRequest(url);
        } catch (Exception e) {
            //TODO: handle exception
        }
        return wht;
    }

    public static void main(String[] args) throws ResourceNotFoundException {
        WeatherServices wht = new WeaterServicesImpl();
        wht.getWeatherCity("london");
    }
}

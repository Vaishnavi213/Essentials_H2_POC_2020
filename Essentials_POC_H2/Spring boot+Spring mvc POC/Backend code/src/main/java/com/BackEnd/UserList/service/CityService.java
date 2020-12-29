package com.BackEnd.UserList.service;


import com.BackEnd.UserList.model.City;
import com.BackEnd.UserList.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService {

    @Autowired
    private CityRepository cityRepository;

    public List<City> getCity(){
        return cityRepository.findAll();
    }

    public City addCity(City city){
        return cityRepository.saveAndFlush(city);
    }

}

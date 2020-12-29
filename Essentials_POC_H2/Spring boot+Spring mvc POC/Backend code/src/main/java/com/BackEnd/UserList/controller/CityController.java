package com.BackEnd.UserList.controller;


import com.BackEnd.UserList.model.City;
import com.BackEnd.UserList.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class CityController {

    @Autowired
    private CityService cityService;

    @GetMapping("city")
    @CrossOrigin("http://localhost:8080")
    public List<City> getCity(){
        return cityService.getCity();
    }

    @PostMapping("city")
    public City addCity(@Valid @RequestBody City city){
        return cityService.addCity(city);
    }
}

package com.example.baithimd4.controller;


import com.example.baithimd4.model.Tourist;
import com.example.baithimd4.service.interf.CountryService;
import com.example.baithimd4.service.interf.TouristService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping("api/tourists")
public class TouristController {
    @Autowired
    TouristService touristService;
    @Autowired
    CountryService countryService;

    @GetMapping("")
    public ResponseEntity<Iterable<Tourist>> findAll(){
        Iterable<Tourist> tourists= touristService.findAll();
        return new ResponseEntity<>(tourists, HttpStatus.OK);
    }
}

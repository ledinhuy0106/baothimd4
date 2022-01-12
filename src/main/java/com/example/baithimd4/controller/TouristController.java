package com.example.baithimd4.controller;


import com.example.baithimd4.model.Tourist;
import com.example.baithimd4.service.interf.CountryService;
import com.example.baithimd4.service.interf.TouristService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("api/tourists")
public class TouristController {
    @Autowired
    TouristService touristService;
    @Autowired
    CountryService countryService;

    @GetMapping("")
    public ResponseEntity<Iterable<Tourist>> findAll() {
        Iterable<Tourist> tourists = touristService.findAll();
        return new ResponseEntity<>(tourists, HttpStatus.OK);

    }

    @PostMapping("")
    public ResponseEntity<Tourist> create(@RequestBody Tourist tourist) {
        touristService.save(tourist);
        return new ResponseEntity<>(tourist, HttpStatus.CREATED);
    }
}

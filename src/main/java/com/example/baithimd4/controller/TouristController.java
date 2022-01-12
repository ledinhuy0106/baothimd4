package com.example.baithimd4.controller;


import com.example.baithimd4.model.Country;
import com.example.baithimd4.model.Tourist;
import com.example.baithimd4.service.interf.CountryService;
import com.example.baithimd4.service.interf.TouristService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

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

    @PutMapping("/{id}")
    public ResponseEntity<Tourist> update(@PathVariable Integer id, @RequestBody Tourist tourist) {
        tourist.setId(id);
        touristService.save(tourist);
        return new ResponseEntity<>(tourist, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Tourist> delete(@PathVariable Integer id) {
        touristService.remove(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Tourist> detail(@PathVariable Integer id) {
        Optional<Tourist> tourists = touristService.findById(id);
        return new ResponseEntity<>(tourists.get(), HttpStatus.OK);
    }

    @GetMapping("country")
    public ResponseEntity<Iterable<Country>> findAllCategory() {
        Iterable<Country> countries = countryService.findAll();
        return new ResponseEntity<>(countries, HttpStatus.OK);
    }
}

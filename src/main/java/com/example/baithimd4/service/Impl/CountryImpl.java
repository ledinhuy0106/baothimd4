package com.example.baithimd4.service.Impl;

import com.example.baithimd4.model.Country;
import com.example.baithimd4.repository.CountryRepository;
import com.example.baithimd4.service.interf.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CountryImpl implements CountryService {
    @Autowired
    CountryRepository countryRepository;

    @Override
    public Iterable<Country> findAll() {
        return countryRepository.findAll();
    }

    @Override
    public Optional<Country> findById(int id) {
        return countryRepository.findById(id);
    }

    @Override
    public void save(Country country) {
        countryRepository.save(country);
    }

    @Override
    public void remove(int id) {
        countryRepository.deleteById(id);
    }
}

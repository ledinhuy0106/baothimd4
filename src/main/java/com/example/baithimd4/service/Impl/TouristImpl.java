package com.example.baithimd4.service.Impl;

import com.example.baithimd4.model.Tourist;
import com.example.baithimd4.repository.TouristRepository;
import com.example.baithimd4.service.interf.TouristService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TouristImpl implements TouristService {
    @Autowired
    TouristRepository touristRepository;

    @Override
    public Iterable<Tourist> findAll() {
        return touristRepository.findAll();
    }

    @Override
    public Optional<Tourist> findById(int id) {
        return touristRepository.findById(id);
    }

    @Override
    public void save(Tourist tourist) {
        touristRepository.save(tourist);
    }

    @Override
    public void remove(int id) {
        touristRepository.deleteById(id);
    }
}

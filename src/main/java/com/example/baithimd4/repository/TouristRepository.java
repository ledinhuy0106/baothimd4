package com.example.baithimd4.repository;

import com.example.baithimd4.model.Tourist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TouristRepository extends JpaRepository<Tourist,Integer> {
}

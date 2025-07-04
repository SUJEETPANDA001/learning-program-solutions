package com.example.ormlearn.repository;

import com.example.ormlearn.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, String> {
}
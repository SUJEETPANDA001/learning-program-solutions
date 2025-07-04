package com.cognizant.ormlearn.repository;

import com.cognizant.ormlearn.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface CountryRepository extends JpaRepository<Country, String> {
    List<Country> findByNameContainingIgnoreCase(String partialName);
    List<Country> findByNameContainingIgnoreCaseOrderByNameAsc(String partialName);
    List<Country> findByNameStartingWith(char letter);
}
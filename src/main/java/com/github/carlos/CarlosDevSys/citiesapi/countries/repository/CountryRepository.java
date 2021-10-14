package com.github.carlos.CarlosDevSys.citiesapi.countries.repository;

import com.github.carlos.CarlosDevSys.citiesapi.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CountryRepository extends JpaRepository<Country, Long> {
}

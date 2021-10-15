package com.github.carlos.CarlosDevSys.CitiesApiApplication.countries.repository;

import com.github.carlos.CarlosDevSys.CitiesApiApplication.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CountryRepository extends JpaRepository<Country, Long> {
}

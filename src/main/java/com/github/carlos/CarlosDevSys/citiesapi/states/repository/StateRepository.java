package com.github.carlos.CarlosDevSys.citiesapi.states.repository;

import com.github.carlos.CarlosDevSys.citiesapi.states.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}

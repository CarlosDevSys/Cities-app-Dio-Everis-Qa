package com.github.carlos.CarlosDevSys.CitiesApiApplication.states.repository;

import com.github.carlos.CarlosDevSys.CitiesApiApplication.states.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}

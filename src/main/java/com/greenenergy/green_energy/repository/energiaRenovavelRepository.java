package com.greenenergy.green_energy.repository;

import com.greenenergy.green_energy.model.energiaRenovavel;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface energiaRenovavelRepository extends JpaRepository<energiaRenovavel, Long> {
    List<energiaRenovavel> findByTypeContaining(String type);
}

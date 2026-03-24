package com.example.ejercicio_jpa.repository;

import com.example.ejercicio_jpa.model.Asset;
import com.example.ejercicio_jpa.model.Measurement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MeasurementRepository extends JpaRepository<Measurement,Long> {
    public List<Measurement> findByTimeStampBetween(Integer id, String start, String end);
}

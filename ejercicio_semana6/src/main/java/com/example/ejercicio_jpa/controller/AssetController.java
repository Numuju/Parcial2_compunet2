package com.example.ejercicio_jpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AssetController {
    @Autowired
    private com.example.ejercicio_jpa.repository.MeasurementRepository assetRepository;

    @GetMapping("/assets/{id}/measurements")
    public List<com.example.ejercicio_jpa.model.Measurement> getMeasurementsByAssetId
            (@PathVariable Integer id,
             @RequestParam String start,
             @RequestParam String end) {
        return assetRepository.findByTimeStampBetween(id, start, end);
    }

}

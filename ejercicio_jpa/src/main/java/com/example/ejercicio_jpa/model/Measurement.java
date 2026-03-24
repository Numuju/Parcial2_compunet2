package com.example.ejercicio_jpa.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.List;

@Entity
@Table(name="measurement_app")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Measurement {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "sequence_measurement")
    @SequenceGenerator(name = "sequence_measurement",sequenceName = "sequence_measurement",allocationSize = 1)
    private Integer id;
    @ManyToOne()
    @JoinColumn(name = "asset_id", referencedColumnName = "id")
    @JsonIgnore
    private Asset asset;


}

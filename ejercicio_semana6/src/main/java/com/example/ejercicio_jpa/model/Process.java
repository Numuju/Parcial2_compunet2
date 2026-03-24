package com.example.ejercicio_jpa.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name="process_app")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Process {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "sequence_process")
    @SequenceGenerator(name = "sequence_process",sequenceName = "sequence_process",allocationSize = 1)
    private Integer id;
    private String description;
    private String name;
    private String state;
    private Integer work_space;
    @ManyToMany(mappedBy = "processes")
    private List<Asset> assets;

}

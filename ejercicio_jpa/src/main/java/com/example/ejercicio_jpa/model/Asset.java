package com.example.ejercicio_jpa.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name="asset_app")
@AllArgsConstructor
@NoArgsConstructor
public class Asset {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "sequence_asset")
    @SequenceGenerator(name = "sequence_asset",sequenceName = "sequence_asset",allocationSize = 1)
    private Integer id;

    private String asset_state;
    private String description;
    private String name;
    private Integer asset_sup;
    private Integer  type;
    private Integer work_space;

    @OneToMany(mappedBy = "asset")
    private List<Measurement> measurements;
    @ManyToMany
    @JoinTable(
            name = "asset_process",
            joinColumns = @JoinColumn(name = "asset_id"),
            inverseJoinColumns = @JoinColumn(name = "process_id")
    )
    private List<Process> processes;




}

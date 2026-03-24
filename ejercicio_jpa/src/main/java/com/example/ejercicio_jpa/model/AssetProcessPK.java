package com.example.ejercicio_jpa.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class AssetProcessPK {
    @Column(name = "process_id",insertable = false,updatable = false)
    private long processId;
    @Column(name = "asset_id",insertable = false,updatable = false)
    private long assetId;
}

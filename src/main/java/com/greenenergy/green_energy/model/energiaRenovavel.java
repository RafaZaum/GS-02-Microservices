package com.greenenergy.green_energy.model;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class energiaRenovavel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String type;

    @Column(nullable = false)
    private double capacity;

    @Column(nullable = false)
    private double efficiency;

    @Column(nullable = false)
    private String manufacturer;

    @Column(nullable = false)
    private double cost;
}

package com.greenenergy.green_energy.dto;

import lombok.Data;

@Data
public class energiaRenovavelDto {
    private Long id;
    private String type;
    private double capacity;
    private double efficiency;
    private String manufacturer;
    private double cost;
}
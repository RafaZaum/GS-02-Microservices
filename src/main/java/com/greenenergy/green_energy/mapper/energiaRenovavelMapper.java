package com.greenenergy.green_energy.mapper;

import com.greenenergy.green_energy.dto.*;
import com.greenenergy.green_energy.model.*;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class energiaRenovavelMapper {

    private final ModelMapper modelMapper;

    public energiaRenovavelMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public energiaRenovavelDto toDto(energiaRenovavel storage) {
        return modelMapper.map(storage, energiaRenovavelDto.class);
    }

    public energiaRenovavel toEntity(energiaRenovavelDto dto) {
        return modelMapper.map(dto, energiaRenovavel.class);
    }
}
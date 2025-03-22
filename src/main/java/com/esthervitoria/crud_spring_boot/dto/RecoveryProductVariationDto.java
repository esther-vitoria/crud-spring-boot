package com.esthervitoria.crud_spring_boot.dto;

import java.math.BigDecimal;

public record RecoveryProductVariationDto(

        Long id,

        String sizeName,

        String description,

        BigDecimal price,

        Boolean available

) {
}
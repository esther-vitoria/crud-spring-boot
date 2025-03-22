package com.esthervitoria.crud_spring_boot.dto;

import java.math.BigDecimal;

public record CreateProductVariationDto(

        String sizeName,

        String description,

        BigDecimal price,

        Boolean available

) {
}

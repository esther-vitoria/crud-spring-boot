package com.esthervitoria.crud_spring_boot.dto;

import java.util.List;

public record CreateProductDto(

        String name,

        String description,

        String category,

        List<CreateProductVariationDto> productVariations,

        Boolean available

) {
}

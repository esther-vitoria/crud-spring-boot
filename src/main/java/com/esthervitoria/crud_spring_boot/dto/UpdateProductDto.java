package com.esthervitoria.crud_spring_boot.dto;

public record UpdateProductDto(

        String name,

        String description,

        Boolean available

) {
}

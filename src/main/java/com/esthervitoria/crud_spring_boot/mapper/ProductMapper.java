package com.esthervitoria.crud_spring_boot.mapper;

import java.util.List;

import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;


import com.esthervitoria.crud_spring_boot.dto.CreateProductVariationDto;
import com.esthervitoria.crud_spring_boot.dto.RecoveryProductDto;
import com.esthervitoria.crud_spring_boot.dto.RecoveryProductVariationDto;
import com.esthervitoria.crud_spring_boot.entities.Product;
import com.esthervitoria.crud_spring_boot.entities.ProductVariation;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    @Mapping(target = "productVariations", qualifiedByName = "mapProductVariationToRecoveryProductVariationDto")
    RecoveryProductDto mapProductToRecoveryProductDto(Product product);

    @Named("mapProductVariationToRecoveryProductVariationDto")
    @IterableMapping(qualifiedByName = "mapProductVariationToRecoveryProductVariationDto")
    List<RecoveryProductVariationDto> mapProductVariationToRecoveryProductVariationDto(List<ProductVariation> productVariations);

    @Named("mapProductVariationToRecoveryProductVariationDto")
    RecoveryProductVariationDto mapProductVariationToRecoveryProductVariationDto(ProductVariation productVariation);

    ProductVariation mapCreateProductVariationDtoToProductVariation(CreateProductVariationDto createProductVariationDto);

}
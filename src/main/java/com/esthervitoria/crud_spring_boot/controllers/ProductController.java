package com.esthervitoria.crud_spring_boot.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import com.esthervitoria.crud_spring_boot.dto.*;
import com.esthervitoria.crud_spring_boot.services.ProductService;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping
    public ResponseEntity<RecoveryProductDto> createProduct(@RequestBody CreateProductDto productDto) {
        return new ResponseEntity<>(productService.createProduct(productDto), HttpStatus.CREATED);
    }

    @PostMapping({"/{productId}/variation"})
    public ResponseEntity<RecoveryProductDto> createProductVariation(@PathVariable Long productId,
                                                                     @RequestBody CreateProductVariationDto createProductVariationDto) {
        return new ResponseEntity<>(productService.createProductVariation(productId, createProductVariationDto), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<RecoveryProductDto>> getProducts() {
        return new ResponseEntity<>(productService.getProducts(), HttpStatus.OK);
    }

    @GetMapping("/{productId}")
    public ResponseEntity<RecoveryProductDto> getProductById(@PathVariable Long productId) {
        return new ResponseEntity<>(productService.getProductById(productId), HttpStatus.OK);
    }

    @PatchMapping("/{productId}")
    public ResponseEntity<RecoveryProductDto> updateProductPart(@PathVariable Long productId, @RequestBody UpdateProductDto updateProductDto) {
        return new ResponseEntity<>(productService.updateProductPart(productId, updateProductDto), HttpStatus.OK);
    }

    @PutMapping("/{productId}/variation/{productVariationId}")
    public ResponseEntity<RecoveryProductDto> updateProductVariation(@PathVariable Long productId, @PathVariable Long productVariationId,
                                                                     @RequestBody UpdateProductVariationDto updateProductVariationDto) {
        return new ResponseEntity<>(productService.updateProductVariation(productId, productVariationId, updateProductVariationDto), HttpStatus.OK);
    }

    @DeleteMapping("/{productId}")
    public ResponseEntity<Void> deleteProductById(@PathVariable Long productId) {
        productService.deleteProductId(productId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/{productId}/variation/{productVariationId}")
    public ResponseEntity<Void> deleteProductVariationById(@PathVariable Long productId, @PathVariable Long productVariationId) {
        productService.deleteProductVariationById(productId, productVariationId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
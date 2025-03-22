package com.esthervitoria.crud_spring_boot.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.esthervitoria.crud_spring_boot.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}

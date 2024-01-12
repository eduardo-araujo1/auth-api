package com.eduardo.authapi.repositories;

import com.eduardo.authapi.domain.product.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, String> {
}

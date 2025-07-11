package com.sangwon.springbootconcurrencylab.repository;

import com.sangwon.springbootconcurrencylab.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}

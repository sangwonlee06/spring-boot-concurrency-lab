package com.sangwon.springbootconcurrencylab.service;

import com.sangwon.springbootconcurrencylab.dto.request.ProductRequestDTO;
import com.sangwon.springbootconcurrencylab.dto.response.ProductResponseDTO;

import java.util.List;

public interface ProductService {
    ProductResponseDTO createProduct(ProductRequestDTO productRequestDTO);
    List<ProductResponseDTO> getAllProducts();
    ProductResponseDTO getProductById(Long id);
    ProductResponseDTO updateProduct(Long id, ProductRequestDTO productRequestDTO);
    void deleteProduct(Long id);

}

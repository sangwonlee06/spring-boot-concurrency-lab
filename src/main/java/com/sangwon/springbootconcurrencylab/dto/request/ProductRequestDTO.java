package com.sangwon.springbootconcurrencylab.dto.request;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProductRequestDTO {

    private String name;

    private String description;

    private BigDecimal price;
}

package com.ecommerce.catalog.domain.model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
@NoArgsConstructor
public class Product {

    private Long id;
    private String sku;
    private String name;
    private String description;
    private String category;
    private Double priceAmount;
    private String priceCurrency;
    private Integer inventoryQuantity;
    private Integer inventoryReservedQuantity;
    private Long inventoryWarehouseId;
    private String brand;
    private String tags;
    private Date createdAt;
    private Date updatedAt;
    private String createdBy;
    private String updatedBy;
    private Integer version;
    private Boolean active;
}


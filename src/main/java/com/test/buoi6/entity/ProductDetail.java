package com.test.buoi6.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "product_detail")
public class ProductDetail {
    @Id
    private Integer id;
    @Column
    private String description;
    @Column
    private String image1;
    @Column
    private String image2;
    @OneToOne(mappedBy = "productDetail",fetch = FetchType.LAZY)
    private Product product;
}

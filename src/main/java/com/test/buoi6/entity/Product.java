package com.test.buoi6.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String name;
    @Column
    private String image;
    @Column
    private long price;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "detail_id", referencedColumnName = "id" )
    ProductDetail productDetail;

    @ManyToOne(fetch = FetchType.LAZY) //Why this one are not having cascade
    @JoinColumn(name="category_id")
    private Category category;
}

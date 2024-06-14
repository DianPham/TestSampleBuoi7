package com.test.buoi6.repository;

import com.test.buoi6.entity.Product;
import com.test.buoi6.entity.ProductDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductDetailRepository extends JpaRepository<ProductDetail, Integer> {
}

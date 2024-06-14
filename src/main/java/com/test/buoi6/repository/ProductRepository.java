package com.test.buoi6.repository;

import com.test.buoi6.entity.Category;
import com.test.buoi6.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
}

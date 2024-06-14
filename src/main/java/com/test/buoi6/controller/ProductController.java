package com.test.buoi6.controller;

import com.test.buoi6.entity.Category;
import com.test.buoi6.entity.Product;
import com.test.buoi6.entity.ProductDetail;
import com.test.buoi6.repository.CategoryRepository;
import com.test.buoi6.repository.ProductDetailRepository;
import com.test.buoi6.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private ProductDetailRepository productDetailRepository;
    @Autowired
    private CategoryRepository categoryRepository;

    @ResponseBody
    @GetMapping
    public List<Product> index()
    {
        List<Product> listProduct = productRepository.findAll();
        for (Product i: listProduct)
        {
            ProductDetail detail = productDetailRepository.findById(i.getId()).orElse(null);
            if (detail != null)
                i.setProductDetail(detail);
            Category category = categoryRepository.findById(i.getId()).orElse(null);
            if (category != null)
                i.setCategory(category);
        }
        return listProduct;
    }
}

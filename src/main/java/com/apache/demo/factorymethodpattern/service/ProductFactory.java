//package com.apache.demo.factorymethodpattern.service;
//
//import com.apache.demo.factorymethodpattern.repository.ProductRepository;
//import lombok.AllArgsConstructor;
//import org.springframework.stereotype.Service;
//
//@AllArgsConstructor
//@Service
//public class ProductFactory implements IProductFactory{
//    private ProductRepository productRepository;
//    @Override
//    public IProductService createProductService() {
//        return new ProductService(productRepository);
//    }
//}

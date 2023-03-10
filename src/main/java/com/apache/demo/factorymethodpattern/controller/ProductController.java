//package com.apache.demo.factorymethodpattern.controller;
//
////import com.apache.demo.factorymethodpattern.entity.Product;
//import com.apache.demo.factorymethodpattern.service.IProductService;
//import com.apache.demo.factorymethodpattern.service.ProductFactory;
//import com.apache.demo.factorymethodpattern.service.ProductService;
//import lombok.AllArgsConstructor;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@AllArgsConstructor
//public class ProductController {
//
//    private ProductFactory productServiceFactory;
//
//    //factory method bisa untuk singleton bisa juga enggak,
//    // tujuan factory method itu untuk membuat object
////    @PostMapping("/api/products")
////    public void createProduct(@RequestBody Product product) {
////        // Create a new ProductService instance using the factory method
////        IProductService productService = productServiceFactory.createProductService();
////
////        // Create the product using the ProductService
////        productService.createProduct(product);
////    }
//}

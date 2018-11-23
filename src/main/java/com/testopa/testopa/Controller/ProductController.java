package com.testopa.testopa.Controller;

import com.testopa.testopa.domain.Product;
import com.testopa.testopa.services.ProductService;
import com.testopa.testopa.services.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    private ProductService productService;
    private SellerService sellerService;

    @Autowired
    public ProductController(ProductService productService, SellerService sellerService){
        this.productService = productService;
        this.sellerService = sellerService;
    }

    @GetMapping("/id")
    public ResponseEntity<Product> findById(@PathVariable Long id){
        return new ResponseEntity<Product>(productService.findById(id), HttpStatus.OK);
    }

}

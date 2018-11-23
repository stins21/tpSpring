package com.testopa.testopa.services;

import com.testopa.testopa.domain.Product;
import com.testopa.testopa.domain.Seller;
import com.testopa.testopa.repository.ProductRepository;
import com.testopa.testopa.repository.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class DataLoader {

    private SellerRepository sellerRepo;
    private ProductRepository productRepo;

    @Autowired
    public DataLoader(SellerRepository sellerRepo, ProductRepository productRepo) {
        super();
        this.sellerRepo = sellerRepo;
        this.productRepo = productRepo;
    }

    @PostConstruct
    private void loadData() {
        Seller seller = new Seller(null, "nathan", "rich", "mange des pommes", null);
        Seller seller2 = new Seller(null, "jean", "paul", "mange des poires", null);
        Seller seller3 = new Seller(null, "val", "jean", "mange des artichauds", null);
        sellerRepo.save(seller);
        sellerRepo.save(seller2);
        sellerRepo.save(seller3);

        Product prod = new Product(null, "chocoalt", 20.00, seller);
        Product prod2 = new Product(null, "chocolat chaud", 20.00, seller2);
        Product prod3 = new Product(null, "chocolat sans typo", 20.00, seller3);
        productRepo.save(prod);
        productRepo.save(prod2);
        productRepo.save(prod3);
    }

}

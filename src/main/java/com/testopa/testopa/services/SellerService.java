package com.testopa.testopa.services;

import com.testopa.testopa.domain.Product;
import com.testopa.testopa.domain.Seller;
import com.testopa.testopa.repository.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SellerService {
    private SellerRepository sellerRepo;

    @Autowired
    public SellerService(SellerRepository sellerRepo){
        super();
        this.sellerRepo = sellerRepo;
    }

    public void createSeller(String name, String lastName, String bio){
        Seller seller = new Seller(null, name, lastName, bio, null);
        sellerRepo.save(seller);
    }

    //TODO FOR REAL LIFE: do not get the 1st one
    public void updateSeller(String name, String bio , List<Product> prod){
        List<Seller> sellers = sellerRepo.findAllByLastname(name);
        Seller seller = sellers.get(0);
        seller.setBio(bio);
        seller.setProducts(prod);
    }

    public void updateSeller(String name, String bio){
        updateSeller(name, bio, null);
    }

    public Seller findByName(String name){
        List<Seller> sellers = sellerRepo.findAllByLastname(name);
        return (sellers.isEmpty()) ? null : sellers.get(0);
    }

    public List<Seller> findAllOrdered(){
        return sellerRepo.findAllByOrderByLastname();
    }
}

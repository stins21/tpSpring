package com.testopa.testopa.repository;

import com.testopa.testopa.domain.Seller;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SellerRepository extends CrudRepository<Seller, Long>{
    List<Seller> findAllByLastname(String lastName);
    List<Seller> findAllByOrderByLastname();
}

package com.mascenes.store.repository;

import com.mascenes.store.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductsRepo extends JpaRepository<Product, Long> {

    List<Product> findByTitle(String name);

    Product findByBarCodeNumber(String barcode);

    @Override
    Product getOne(Long id);
}
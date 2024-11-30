package com.cpnscommerce.cpnscommerce_java.repository;

import com.cpnscommerce.cpnscommerce_java.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}

package com.cpnscommerce.cpnscommerce_java.repository;

import com.cpnscommerce.cpnscommerce_java.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, ProductCategory.ProductCateogoryId> {

}

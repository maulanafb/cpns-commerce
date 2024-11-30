package com.cpnscommerce.cpnscommerce_java.repository;

import com.cpnscommerce.cpnscommerce_java.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, ProductCategory.ProductCateogoryId> {
    @Query(value = """
            SELECT * FROM product_category 
            WHERE product_id = :productId
            """, nativeQuery = true)
    List<ProductCategory> findCategoriesByProductId(@Param("productId") Long productId);

}

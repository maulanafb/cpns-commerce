package com.cpnscommerce.cpnscommerce_java.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "product_category")
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductCategory {

    @EmbeddedId
    private ProductCateogoryId id;

    @CreationTimestamp
    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @Embeddable
    public static class ProductCateogoryId {
        @Column(name = "product_id")
        private Long productId;
        @Column(name = "category_id")
        private Long categoryId;
}
}

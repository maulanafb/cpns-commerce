package com.cpnscommerce.cpnscommerce_java.controller;

import com.cpnscommerce.cpnscommerce_java.model.ProductRequest;
import com.cpnscommerce.cpnscommerce_java.model.ProductResponse;
import jakarta.validation.Valid;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("product")
public class ProductController {

    @GetMapping("/{id}")
    public ResponseEntity<ProductResponse> findProductById(
            @PathVariable(value = "id") Long productId) {
        return ResponseEntity.ok(
                ProductResponse.builder()
                        .name("Product " + productId)
                        .price(BigDecimal.ONE)
                        .description("deskripsi produk")
                        .build()
        );
    }

    @GetMapping("")
    public ResponseEntity<List<ProductResponse>> findProduct() {
        return ResponseEntity.ok(List.of(
                ProductResponse.builder()
                        .name("Product 1")
                        .price(BigDecimal.ONE)
                        .description("deskripsi produk")
                        .build(),
                ProductResponse.builder()
                        .name("Product 2")
                        .price(BigDecimal.TEN)
                        .description("deskripsi produk")
                        .build()
        ));
    }

    @PostMapping("")
        public ResponseEntity<ProductResponse> createProduct(@RequestBody @Valid ProductRequest productRequest) {
            return ResponseEntity.ok(
                    ProductResponse.builder()
                            .name(productRequest.getName())
                            .price(productRequest.getPrice())
                            .description(productRequest.getDescription())
                            .build()
            );
        }

    @PutMapping("/{id}")
    public ResponseEntity<ProductResponse> updateProduct(@RequestBody @Valid ProductRequest productRequest,@PathVariable(name = "id") Long productId) {
        return ResponseEntity.ok(
                ProductResponse.builder()
                        .name(productRequest.getName()+ " " + productId)
                        .price(productRequest.getPrice())
                        .description(productRequest.getDescription())
                        .build()
        );
    }
}

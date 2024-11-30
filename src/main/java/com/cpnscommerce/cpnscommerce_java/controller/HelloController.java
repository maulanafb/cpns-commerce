package com.cpnscommerce.cpnscommerce_java.controller;

import com.cpnscommerce.cpnscommerce_java.common.errors.BadRequestException;
import com.cpnscommerce.cpnscommerce_java.common.errors.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello, World!";
    }

    @GetMapping("/bad-request")
    public String badRequest() {
        throw new BadRequestException("Bad Request");
    }

    @GetMapping("/generic-error")
    public String genericError() {
        throw new RuntimeException("Generic Error");
    }

    @GetMapping("/resource-not-found")
    public ResponseEntity<String> resourceNotFound() {
        throw new ResourceNotFoundException("Resource Not Found");
    }
}

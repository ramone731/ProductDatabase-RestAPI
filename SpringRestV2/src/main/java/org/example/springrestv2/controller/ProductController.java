package org.example.springrestv2.controller;

import org.example.springrestv2.model.Product;
import org.example.springrestv2.model.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
/*
 * Controller annotation can be used to create web application
 * RestController is a combination of Controller and ResponseEntity
 */
public class ProductController {
    @Autowired
     ProductRepository productrep;
    /*
     * GetMapping-retreive the data
     * PostMapping--insert the data
     * PutMapping-update the data
     * DeleteMapping-Delete the data
     */
    @GetMapping("/retreiveProduct")
    public List<Product> getProductList()
    {
        return productrep.findAll();

    }
    @PostMapping("/insertProduct")
    public Product insertData(@RequestBody Product p)
    {
        return productrep.save(p);

    }

}
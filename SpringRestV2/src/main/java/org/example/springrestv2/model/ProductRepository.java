package org.example.springrestv2.model;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product,Integer> {
/*
* select * from Product where productname=?
*  */

    public List<Product> findByProductname(String name);
    //select * form product order by price asc
    public List<Product>findByOrderByPriceAsc();

    List<Product> findByOrderPriceAsc();
}
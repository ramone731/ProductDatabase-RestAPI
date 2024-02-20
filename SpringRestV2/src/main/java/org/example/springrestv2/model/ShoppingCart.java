package org.example.springrestv2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import org.example.springrestv2.model.Product;

import java.util.List;

@Entity
@Table(name="shoppingcart")
public class ShoppingCart {
    @Id
    private int shopid;

    @OneToMany(cascade=shopid.ALL)
    @JoinColumn(name="shopid")
    private List<Product> prodlist;
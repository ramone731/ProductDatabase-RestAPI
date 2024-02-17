package org.example.springrestv2.model;

//jpa annotations
import jakarta.persistence.Column;
import jakarta.persistence.Id;

public class Product {
    /*
     * Productid: maps into db table
     * productname, price, quantity: column db column
     * */
    @Id
    @Column(name="Productid")
    private int productid;
    @Column(name="Productname")
    private String productname;
    @Column(name="Price")
    private double price;
    @Column(name="Quantity")
    private int quantity;
    public int getProductid() {

        return productid;
    }

//getter & setters: Product,productname, price, quantity
    public void setProductid(int productid) {

        this.productid = productid;
    }
    public String getProductname() {
        
        return productname;
    }
    public void setProductname(String productname) {

        this.productname = productname;
    }
    public double getPrice() {

        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getQuantity() {

        return quantity;
    }
    public void setQuantity(int quantity) {

        this.quantity = quantity;
    }

}

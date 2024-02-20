package org.example.springrestv2.model;
import jakarta.persistence.*;
@Entity
@Table(name="Addressobj")
public class Address {
    @Id
    private int addressid;
    public int getAddressid() {
        return addressid;
    }
    public void setAddressid(int addressid) {
        this.addressid = addressid;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    @Column(name="city")
    private String city;
    @Column(name="state")
    private String state;

}

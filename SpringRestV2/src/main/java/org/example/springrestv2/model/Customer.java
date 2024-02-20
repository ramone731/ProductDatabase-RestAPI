package org.example.springrestv2.model;
import jakarta.persistence.*;
@Entity
@Table(name="custobj")
public class Customer {
    @Id
    private int custcode;
    private String customername;
    @OneToOne(targetEntity=Address.class,cascade=CascadeType.ALL)
    @JoinColumn(name="addressid",referencedColumnName="addressid")
    private Address addobj;
    public int getCustcode() {

        return custcode;
    }
    public void setCustcode(int custcode) {

        this.custcode = custcode;
    }
    public String getCustomername() {

        return customername;
    }
    public void setCustomername(String customername) {

        this.customername = customername;
    }
    public Address getAddobj() {

        return addobj;
    }
    public void setAddobj(Address addobj) {

        this.addobj = addobj;
    }

}






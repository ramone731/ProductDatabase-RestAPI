package org.example.springrestv2.model;

import org.example.springrestv2.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Integer>{

}


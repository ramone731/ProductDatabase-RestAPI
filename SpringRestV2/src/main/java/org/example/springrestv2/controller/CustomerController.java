package org.example.springrestv2.controller;

import org.example.springrestv2.model.Customer;
import org.example.springrestv2.model.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CustomerController {
    @Autowired
    CustomerRepository customerep;
    @PostMapping("/insertCustomer")
    public Customer insert(@RequestBody Customer c)
    {
        return customerep.save(c);
    }

}

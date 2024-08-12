package com.nisum.CustomerService.controller;

import com.nisum.CustomerService.entity.Customer;
import com.nisum.CustomerService.service.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/customer")
public class CustomerController {
    private CustomerService customerService;

    @GetMapping
    public ResponseEntity<List<Customer>> fetchCustomers() {
        List<Customer> customers = customerService.getAllCustomers();
        if (customers == null || customers.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(customers, HttpStatus.OK);
    }
}

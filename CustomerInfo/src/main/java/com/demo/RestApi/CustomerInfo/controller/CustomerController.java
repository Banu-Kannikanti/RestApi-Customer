package com.demo.RestApi.CustomerInfo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.RestApi.CustomerInfo.entity.Customer;
import com.demo.RestApi.CustomerInfo.service.CustomerService;

@RestController
public class CustomerController {

	    @Autowired
	    private CustomerService service;

	    @PostMapping("/addCustomer")
	    public Customer addCustomer(@RequestBody Customer customer) {
	        return service.saveCustomer(customer);
	    }

	    @PostMapping("/addCustomers")
	    public List<Customer> addCustomers(@RequestBody List<Customer> customers) {
	        return service.saveCustomers(customers);
	    }

	    @GetMapping("/Customers")
	    public List<Customer> findAllCustomers() {
	        return service.getCustomers();
	    }

	    @GetMapping("/CustomerById/{id}")
	    public Customer findCustomerById(@PathVariable int id) {
	        return service.getCustomerById(id);
	    }

	    @GetMapping("/CustomerByName/{name}")
	    public List<Customer> findCustomerByName(@PathVariable String name) {
	        return service.getCustomerByName(name);
	    }

	    @PutMapping("/update")
	    public Customer updateCustomer(@RequestBody Customer customer) {
	        return service.updateCustomer(customer);
	    }

	    @DeleteMapping("/delete/{id}")
	    public String deleteCustomer(@PathVariable int id) {
	        return service.deleteCustomer(id);
	    }
}

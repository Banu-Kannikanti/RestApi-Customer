package com.demo.RestApi.CustomerInfo.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.demo.RestApi.CustomerInfo.entity.Customer;
import com.demo.RestApi.CustomerInfo.repository.CustomerRepository;
@Service
public class CustomerService {
	    @Autowired
	    private CustomerRepository repository;

	    public Customer saveCustomer(Customer customer) {
	        return repository.save(customer);
	    }

	    public List<Customer> saveCustomers(List<Customer> customers) {
	        return repository.saveAll(customers);
	    }

	    public List<Customer> getCustomers() {
	        return repository.findAll();
	    }

	    public Customer getCustomerById(int id) {
	        return repository.findById(id).orElse(null);
	    }

	    public List<Customer> getCustomerByName(String name) {
	        return repository.findByName(name);
	    }

	    public String deleteCustomer(int id) {
	        repository.deleteById(id);
	        return "Customer Removed with id  " + id;
	    }

	    public Customer updateCustomer(Customer customer) {
	    	Customer existingCustomer = repository.findById(customer.getId()).orElse(null);
	        existingCustomer.setName(customer.getName());
	        existingCustomer.setGender(customer.getGender());
	        existingCustomer.setAge(customer.getAge());
	        existingCustomer.setPreferredFood(customer.getPreferredFood());
	        return repository.save(existingCustomer);
	    }


	}

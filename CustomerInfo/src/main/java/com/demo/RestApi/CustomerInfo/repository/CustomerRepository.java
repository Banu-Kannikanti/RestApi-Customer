package com.demo.RestApi.CustomerInfo.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.demo.RestApi.CustomerInfo.entity.Customer;
public interface CustomerRepository extends JpaRepository<Customer,Integer>{

	List<Customer> findByName(String name);

}

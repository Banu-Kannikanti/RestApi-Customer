package com.demo.RestApi.CustomerInfo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;
import com.demo.RestApi.CustomerInfo.entity.Customer;
import com.demo.RestApi.CustomerInfo.repository.CustomerRepository;

@SpringBootTest
@TestMethodOrder(OrderAnnotation.class)
class CustomerInfoApplicationTests {
@Autowired
CustomerRepository cr;
	@Test
	@Order(1)
	void createCustomer() {
		Customer c=new Customer();
		c.setName("Harry");
		c.setGender("Male");
		c.setAge(30);
		c.setPreferredFood("Vegetarian");
		cr.save(c);
		assertNotNull(cr.findById(1));
	}
   @Test
   @Order(2)
   void getCustomer()
   {
	   assertEquals("Harry",cr.findById(1).get().getName());
   }
   @Test
   @Order(3)
   void deleteCustomer() {
	   cr.deleteById(1);
	   assertThat(cr.existsById(1)).isFalse();
   }
}

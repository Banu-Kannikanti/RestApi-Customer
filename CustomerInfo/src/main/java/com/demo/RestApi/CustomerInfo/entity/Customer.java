package com.demo.RestApi.CustomerInfo.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="customer")
public class Customer {
	@Id
	@GeneratedValue
	int id;
	String name;
	String gender ;
	int age ; 
	String preferredFood;
	
	public Customer() {
	}
	
	public Customer(int id, String name, String gender, int age, String preferredFood) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.preferredFood = preferredFood;
	}

	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPreferredFood() {
		return preferredFood;
	}
	public void setPreferredFood(String preferredFood) {
		this.preferredFood = preferredFood;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", gender=" + gender + ", age=" + age + ", preferredFood="
				+ preferredFood + "]";
	}
	
}

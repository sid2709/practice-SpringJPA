package com.jpa.example.jpa;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jpa.example.jpa.Dao.PersonJpaRepository;
import com.jpa.example.jpa.entity.Person;
import com.jpa.example.jpa.services.PersonServices;

@SpringBootApplication
public class JpaApplication implements CommandLineRunner {

	@Autowired
	PersonJpaRepository repository;
	
	@Autowired
	PersonServices services;

	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		//Method to get Data from Id
		//System.out.println(services.findById(1).getName());
		
		//List of All
		//TypedQuery<Person> personList= services.findAll();
		
		//Deleting a persson
		//services.deleteById(2);
		
		//inserting a person
		Person p=new Person("Rajat","Haridwar");

		services.insert(p);
	}

}

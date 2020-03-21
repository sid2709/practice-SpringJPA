package com.jpa.example.jpa.services;

import java.util.List;

import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpa.example.jpa.Dao.PersonJpaRepository;
import com.jpa.example.jpa.entity.Person;

@Service
public class PersonServices {

	@Autowired
	PersonJpaRepository personDao;

	public Person findById(int id) {
		return personDao.findById(id);

	}
	
	//findAll
	public TypedQuery<Person> findAll() {
		System.out.println("IN services");
		return personDao.findAll();

	}
	
	public void deleteById(int id) {
		System.out.println("Inside servies");
		personDao.deleteById(id);
		System.out.println("Successfully deleted");
	}
	
	public void insert(Person person) {
		Person personName=personDao.insert(person);
		System.out.println(person.getName());
	}
	
}
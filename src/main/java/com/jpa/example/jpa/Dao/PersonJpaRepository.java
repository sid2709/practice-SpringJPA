package com.jpa.example.jpa.Dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jpa.example.jpa.entity.Person;

@Repository
@Transactional
public class PersonJpaRepository {

	// connect to the database
	@PersistenceContext
	EntityManager entityManager;

	public Person findById(int id) {
		return entityManager.find(Person.class, id);// JPA
	}

	public TypedQuery<Person> findAll() {
		// TypedQuery<Person> namedQuery =
		// entityManager.createNamedQuery("find_all_persons", Person.class);
		System.out.println("In Repository");
		TypedQuery<Person> namedQuery =entityManager.createQuery("select p from Person p", Person.class);
		return namedQuery;
	}
	
	public void deleteById(int id) {
		Person person = findById(id);
		entityManager.remove(person);
	}
	
	public Person insert(Person person) {
		return entityManager.merge(person);
	}
	

}

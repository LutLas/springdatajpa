package io.erehsawsaltul.springdatajpa.repositories;

import org.springframework.data.repository.CrudRepository;

import io.erehsawsaltul.springdatajpa.entities.Product;
import java.lang.String;
import java.util.List;

public interface ProductRepository extends CrudRepository<Product, Long> {
	List<Product> findByName(String name);
	
	List<Product> findByNameAndPrice(String name, Double price);
}

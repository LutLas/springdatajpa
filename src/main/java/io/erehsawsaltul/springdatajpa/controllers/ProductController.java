package io.erehsawsaltul.springdatajpa.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.erehsawsaltul.springdatajpa.entities.Product;
import io.erehsawsaltul.springdatajpa.repositories.ProductRepository;

@RestController
@RequestMapping("/products")
public class ProductController {

	@Autowired
	ProductRepository repository;

	@GetMapping
	public Iterable<Product> getProducts() {
		return repository.findAll();
	}

	@PostMapping
	public Product create(@RequestBody Product product) {
		return repository.save(product);
	}

	@PutMapping
	public Product update(@RequestBody Product product) {
		return repository.save(product);
	}
	
	@GetMapping("/{id}")
	public Product getProduct(@PathVariable("id") Long id) {
		return repository.findById(id).orElseThrow();
	}
}

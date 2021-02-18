package io.erehsawsaltul.springdatajpa.repositories;

import org.springframework.data.repository.CrudRepository;

import io.erehsawsaltul.springdatajpa.entities.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {

}

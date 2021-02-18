package io.erehsawsaltul.springdatajpa;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import io.erehsawsaltul.springdatajpa.entities.Product;
import io.erehsawsaltul.springdatajpa.repositories.ProductRepository;

@SpringBootTest
class SpringdatajpaApplicationTests {

	@Autowired
	ApplicationContext context;
	
	@Test
	void contextLoads() {
		ProductRepository productRepository = context.getBean(ProductRepository.class);
		
		Product bluetoothSpeaker = new Product();
		bluetoothSpeaker.setId(6L);
		bluetoothSpeaker.setName("Bluetooth Speaker");
		bluetoothSpeaker.setDescription("Cyboris MINI 90W Bluetooth Speaker");
		bluetoothSpeaker.setPrice(150.25d);
		
		Product bottle = new Product();
		bottle.setId(7L);
		bottle.setName("Juice Bottle");
		bottle.setDescription("1L Bottle for Storing Juices or Drinks");
		bottle.setPrice(75.35d);
		
		//productRepository.save(bottle);
		
		/*
		 * Product result = productRepository.findById(3L).orElseThrow();
		 * System.out.println(result);
		 * 
		 * result.setPrice(3600d); productRepository.save(result);
		 */
		
		productRepository.findAll().forEach(p->{
			System.out.println(p);
		});	
	}
}

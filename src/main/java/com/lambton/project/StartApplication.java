package com.lambton.project;

import java.math.BigDecimal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.lambton.project.domain.Item;
import com.lambton.project.repositories.ItemRepository;

@SpringBootApplication
public class StartApplication {
	private static final Logger logger = LoggerFactory.getLogger(StartApplication.class);

	public static void main(String[] args) {
		logger.info("Application starts");
		SpringApplication.run(StartApplication.class, args);
	}
	
//	@Bean
//	public CommandLineRunner setup(ItemRepository itemRepository) {
//		return (args) -> {
//			itemRepository.save(new Item("Gustavo", new BigDecimal(1.25), "Ponce"));
//			itemRepository.save(new Item("John", new BigDecimal(5.25), "Smith"));
//			itemRepository.save(new Item("Jim ", new BigDecimal(20.0), "Morrison"));
//			itemRepository.save(new Item("David", new BigDecimal(10.5), "Gilmour"));
//			logger.info("The sample data has been generated");
//		};
//	}
}

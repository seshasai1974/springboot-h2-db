package com.db.springboot.example;

import com.db.springboot.example.datamodel.Books;
import com.db.springboot.example.datamodel.BooksChapters;
import com.db.springboot.example.repository.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootH2DbApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringbootH2DbApplication.class, args);

	}

}

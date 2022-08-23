package com.db.springboot.example.repository;

import com.db.springboot.example.datamodel.Books;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BooksRepository extends JpaRepository<Books,Integer> {
}

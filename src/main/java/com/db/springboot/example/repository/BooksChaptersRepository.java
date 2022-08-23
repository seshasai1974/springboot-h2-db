package com.db.springboot.example.repository;

import com.db.springboot.example.datamodel.BooksChapters;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BooksChaptersRepository extends JpaRepository<BooksChapters,Integer> {
}

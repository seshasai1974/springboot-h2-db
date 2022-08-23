package com.db.springboot.example.controller;

import com.db.springboot.example.datamodel.Books;
import com.db.springboot.example.repository.BooksRepository;
import com.db.springboot.example.service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class BooksRestController {

    @Autowired
    BooksService booksService;

    //C R  UD    L
    //: Select * from mybooks

    @GetMapping("/api/v1/books")
    public List<Books> getAllBooks(){
        return booksService.getAllBoooks();
    }

    // select * from mybooks where book_id="book_id"

    @GetMapping("/api/v1/books/{book_id}")
    public Optional<Books> getSpecificBooks(@PathVariable("book_id") int bookID){
        return booksService.getOneBook(bookID);
    }

    @DeleteMapping("/api/v1/books/{book_id}")
    public void deleteSpecificBook(@PathVariable("book_id") int bookID){

        booksService.deleteOneBook(bookID);
    }

    @PostMapping("/api/v1/books")
    public void createNewBook(@RequestBody Books book){

        booksService.createNewBook(book);

    }

    @PutMapping("/api/v1/books")
    public void updateBook(@RequestBody Books book){

        booksService.saveBook(book);

    }



}

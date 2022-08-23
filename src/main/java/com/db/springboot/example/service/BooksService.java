package com.db.springboot.example.service;

import com.db.springboot.example.datamodel.Books;
import com.db.springboot.example.repository.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BooksService {

    @Autowired
    BooksRepository booksRepository;

    public List<Books> getAllBoooks(){
        List<Books> booklist = new ArrayList<Books>();
        booksRepository.findAll().forEach(mybooks -> booklist.add(mybooks));
        return booklist;
    }

    public Optional<Books> getOneBook(int BookID){
        Optional<Books> books= booksRepository.findById(BookID);
        return books;
    }

    public void deleteOneBook(int bookID){
        booksRepository.deleteById(bookID);
    }

    public void createNewBook(Books book){
        booksRepository.save(book);

    }

    public void saveBook(Books book){
        booksRepository.save(book);

    }

}

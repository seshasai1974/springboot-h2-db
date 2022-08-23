package com.db.springboot.example.datamodel;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="books")
public class Books {

    @OneToMany(cascade = CascadeType.ALL)
    List<BooksChapters> chaptersList;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="bookID")
    private int bookID;
    @Column(name="bookname")
    private String bookName;
    @Column(name="authorname")
    private String authorName;
    @Column(name="ISBN")
    private int isbn;

    public Books(){

    }

    public Books(String bookName, String authorName, int isbn) {
        super();
        this.bookName = bookName;
        this.authorName = authorName;
        this.isbn = isbn;
    }

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public List<BooksChapters> getChaptersList() {
        return chaptersList;
    }

    public void setChaptersList(List<BooksChapters> chaptersList) {
        this.chaptersList = chaptersList;
    }


}

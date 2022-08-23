package com.db.springboot.example.datamodel;

import javax.persistence.*;

@Entity
@Table(name="books_chapters")
public class BooksChapters {

    public BooksChapters(){
    }

    public BooksChapters(String chapterTitle, String chapterSummary, int chapterPages) {
        super();
        this.chapterTitle = chapterTitle;
        this.chapterSummary = chapterSummary;
        this.chapterPages = chapterPages;
    }
    /*
    @ManyToOne

    */
    @ManyToOne
    @JoinColumn(name="bookID")
    Books bookObject;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="book_chapter_id")
    private int chapterID;
    @Column(name="chapter_title")
    private String chapterTitle;
    @Column(name="chapter_summary")
    private String chapterSummary;
    @Column(name="chapter_pages")
    private int chapterPages;

    public int getChapterID() {
        return chapterID;
    }

    public void setChapterID(int chapterID) {
        this.chapterID = chapterID;
    }

    public String getChapterTitle() {
        return chapterTitle;
    }

    public void setChapterTitle(String chapterTitle) {
        this.chapterTitle = chapterTitle;
    }

    public String getChapterSummary() {
        return chapterSummary;
    }

    public void setChapterSummary(String chapterSummary) {
        this.chapterSummary = chapterSummary;
    }

    public int getChapterPages() {
        return chapterPages;
    }

    public void setChapterPages(int chapterPages) {
        this.chapterPages = chapterPages;
    }

}

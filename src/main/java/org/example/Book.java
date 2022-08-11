package org.example;

import java.time.LocalDate;
import java.util.Date;

public class Book {
    String title, author, publisher;
    LocalDate cop_date;







    public Book(){}

    public Book(String title, String author, String publisher, LocalDate cop_date) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.cop_date = cop_date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public LocalDate getCop_date() {
        return cop_date;
    }

    public void setCop_date(LocalDate cop_date) {
        this.cop_date = cop_date;
    }

    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", cop_date=" + cop_date +
                '}';
    }
}

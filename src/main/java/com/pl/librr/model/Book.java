package com.pl.librr.model;

import javax.persistence.*;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "content")
    private byte[] content;
    @Column(name = "page_count")
    private int page_count;
    @Column(name = "isbn" , nullable = true)
    private String isbn;
    @Column(name = "description")
    private String description;
    @Column(name = "image")
    private byte[] image;
    @ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.MERGE)
    private Publisher publisher;
    @ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.MERGE)
    private Genre genre;
    @ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.MERGE)
    private Author author;

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public Book() {
    }

    public Book(String name, byte[] content, int page_count, String isbn, String description,  byte[] image) {
        this.name = name;
        this.content = content;
        this.page_count = page_count;
        this.isbn = isbn;
        this.description = description;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte[] getContent() {
        return content;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }

    public int getPage_count() {
        return page_count;
    }

    public void setPage_count(int page_count) {
        this.page_count = page_count;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }
}

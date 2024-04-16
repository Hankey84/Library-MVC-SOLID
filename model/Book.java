package model;

import java.util.ArrayList;
import java.util.List;

public class Book extends PrintEdition {

    private Author author;
    private List<Author> authors;
    private String genre;

    public Book(String title, Author author, String genre, int year) {
        super(title, year);
        this.author = author;
        this.genre = genre;
    }

    public Book(String title, List<Author> authors, int year, String genre) {
        super(title, year);
        this.authors = new ArrayList<>();
        this.genre = genre;
    }

    public Author getAuthor() {
        return author;
    }

    public List<Author> getAuthorList() {
        return authors;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return "Инв.№ "+ id + ", '" + title + "', " + author + ", '" + genre + "', " + year + "г.";
    }

}
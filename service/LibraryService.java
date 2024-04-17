package service;

import java.util.ArrayList;
import java.util.List;

import model.*;

public class LibraryService {

    // private String filter;
    private List<PrintEdition> publications = new ArrayList<>();
    private List<PrintEdition> issuedPublication = new ArrayList<>();
    private List<Author> authors = new ArrayList<>();

    public void addPublication(PrintEdition publication) {
        publications.add(publication);
        if (publication instanceof Book) {
            Book book = (Book) publication;
            List<Author> bookAuthors = book.getAuthorList();
            if (bookAuthors != null) {
                for (Author author : bookAuthors) {
                    if (!authors.contains(author)) {
                        authors.add(author);
                    }
                }
            }
        }
    }
    
    public void addIssuedPublication(PrintEdition publication){
        issuedPublication.add(publication);
    }

    public PrintEdition borrowBook(String title) {
        for (PrintEdition book : publications) {
            if (book.getTitle().equals(title)) {
                addIssuedPublication(book); //Добавляем книгу в раздел "Выданное"
                publications.remove(book); //Убираем эту книгу из библиотеки
                System.out.println("Была выдана книга: " + book);
                return book;
            }
        }
        return null;
    }
        
    public List<PrintEdition> getLibrary() {
        return publications;
    }

    public void addAuthor(Author author) {
        if (!authors.contains(author)) {
            authors.add(author);
        }
    }

    public List<Author> getAuthors() {
        return authors;
    }

}

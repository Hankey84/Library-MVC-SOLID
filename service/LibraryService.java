package service;

import java.util.ArrayList;
import java.util.List;

import model.*;

public class LibraryService {

    private List<PrintEdition> publications = new ArrayList<>();
    private List<Author> authors = new ArrayList<>();

    public void addBook(PrintEdition publication) {
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

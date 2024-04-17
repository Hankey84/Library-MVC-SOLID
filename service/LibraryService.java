package service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

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

    public void addIssuedPublication(PrintEdition publication) {
        issuedPublication.add(publication);
    }

    public PrintEdition borrowBook(String title) {
        for (PrintEdition book : publications) {
            if (book.getTitle().equals(title)) {
                addIssuedPublication(book); // Добавляем книгу в раздел "Выданное"
                publications.remove(book); // Убираем эту книгу из библиотеки
                System.out.println("Была выдана книга: " + book);
                return book;
            }
        }
        return null;
    }

    // Универсальный метод для поиска книги по заданному предикату(кроме автора(ов))
    public void findBooks(Predicate<PrintEdition> predicate, Object filter) {
        List<PrintEdition> result = new ArrayList<>();
        for (PrintEdition book : publications) {
            if (predicate.test(book)) {
                result.add(book);
            }
        }
        System.out.printf("Были найдены по запросу {%s} книги: %s\n", filter, result);

    }

    // Метод для поиска книги по автору(ам)
    public void findBooksByAuthor(String authorName) {
        List<PrintEdition> result = new ArrayList<>();
        for (PrintEdition book : publications) {
            if (book instanceof Book) {
                Book b = (Book) book;
                if (b.getAuthor() != null && b.getAuthor().toString().equals(authorName)) {
                    result.add(book); // Добавляем книгу, если главный автор совпадает с искомым именем
                } else if (b.getAuthorList() != null) {
                    for (Author coauthor : b.getAuthorList()) {
                        if (coauthor != null && coauthor.toString().equals(authorName)) {
                            result.add(book); // Добавляем книгу, если хотя бы один соавтор совпадает с искомым именем
                            break; // Прерываем цикл, так как книга уже добавлена
                        }
                    }
                }
            }
        }
        System.out.printf("Были найдены по запросу {%s} книги: %s\n", authorName, result);
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

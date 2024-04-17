package view;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import model.*;
import controll.LibraryController;

public class LibraryView {

    LibraryController controller = new LibraryController();
    List<Author> coAuthors;

    public LibraryView() {
        this.coAuthors = new ArrayList<>();
    }

    public void addPublication(PrintEdition publication) {
        System.out.printf("Книга %s добавлена в библиотеку\n", publication);
        controller.addPublication(publication);
    }

    public PrintEdition borrowBook(String title) {
        System.out.println("Была выдана книга: " + controller.borrowBook(title));        
        return controller.borrowBook(title);
    }

    public List<PrintEdition> findBooks(Predicate<PrintEdition> predicate, Object filter) {
        System.out.printf("Были найдены по запросу {%s} книги: %s\n", filter, controller.findBooks(predicate, filter));
        return controller.findBooks(predicate, filter);
    }

    public List<PrintEdition> findBooksByAuthor(String authorName){
        System.out.printf("Были найдены по запросу {%s} книги: %s\n", authorName, controller.findBooksByAuthor(authorName));
        return controller.findBooksByAuthor(authorName);
    }

    public List<PrintEdition> getLibrary() {
        System.out.println("Список литературы в библиотеке: ");
        return controller.getLibrary();
    }

    public void addAuthor(Author author) {
        coAuthors.add(author);
    }

    public List<Author> getAuthors() {
        return coAuthors;
    }

}

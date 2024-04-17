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
        return controller.borrowBook(title);
    }

    public void findBooks(Predicate<PrintEdition> predicate, Object filter) {
        controller.findBooks(predicate, filter);
    }

    public void findBooksByAuthor(String authorName){
        controller.findBooksByAuthor(authorName);
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

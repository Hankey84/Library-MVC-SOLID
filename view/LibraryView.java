package view;

import java.util.ArrayList;
import java.util.List;
import model.*;
import controll.LibraryController;

public class LibraryView {

    LibraryController controller = new LibraryController();
    List<Author> coAuthors;

    public LibraryView() {
        this.coAuthors = new ArrayList<>();
    }

    public void addBook(PrintEdition publication) {
        System.out.printf("Книга %s добавлена в библиотеку\n", publication);
        controller.addBook(publication);
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

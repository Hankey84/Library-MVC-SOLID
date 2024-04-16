package view;

import java.util.List;
import model.*;
import controll.LibraryController;

public class LibraryView {

    LibraryController controller = new LibraryController();

    public void addBook(PrintEdition publication) {
        System.out.printf("Книга %s добавлена в библиотеку\n", publication);
        controller.addBook(publication);
    }

    public List<PrintEdition> getLibrary(String type) {
        return controller.getLibrary(type);
    }

}

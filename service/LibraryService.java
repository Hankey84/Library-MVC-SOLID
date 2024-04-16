package service;

import java.util.ArrayList;
import java.util.List;

import model.*;

public class LibraryService {

    List<PrintEdition> library = new ArrayList<>();

    public void addBook(PrintEdition publication) {
        library.add(publication);
    }

    public List<PrintEdition> getLibrary(String type) {
        return library;
    }

}

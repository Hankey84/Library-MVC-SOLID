package controll;

import java.util.List;
import model.*;
import service.LibraryService;

public class LibraryController {

    LibraryService service = new LibraryService();
   
    public void addBook(PrintEdition publication) {
        service.addBook(publication);
    }

    public List<PrintEdition> getLibrary() {
        return service.getLibrary();
    }

    public List<Author> getAuthors() {
        return service.getAuthors();
    }

}

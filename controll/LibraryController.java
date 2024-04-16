package controll;

import java.util.List;
import model.*;
import service.LibraryService;

public class LibraryController {

    LibraryService service = new LibraryService();

    public void addBook(PrintEdition publication) {
        service.addBook(publication);
    }

    public List<PrintEdition> getLibrary(String type) {
        return service.getLibrary(type);
    }
}

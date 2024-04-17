package controll;

import java.util.List;
import java.util.function.Predicate;

import model.*;
import service.LibraryService;

public class LibraryController {

    LibraryService service = new LibraryService();
   
    public void addPublication(PrintEdition publication) {
        service.addPublication(publication);
    }

    public PrintEdition borrowBook(String title){
        return service.borrowBook(title);
    }

    public void findBooks(Predicate<PrintEdition> predicate, Object filter) {
        service.findBooks(predicate, filter);
    }

    public void findBooksByAuthor(String authorName){
        service.findBooksByAuthor(authorName);
    }

    public List<PrintEdition> getLibrary() {
        return service.getLibrary();
    }

    public List<Author> getAuthors() {
        return service.getAuthors();
    }

}

import model.*;
import view.LibraryView;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Т. Драйзер");
        Author author2 = new Author("Д. Оруэлл");
        Author author3 = new Author("Л.Н. Толстой");
        Author author4 = new Author("В.О. Пелевин");
        Author author5 = new Author("А.С. Пушкин");
        Author author6 = new Author("Д.С. Сугралинов");

        PrintEdition book1 = new Book("Стоик", author1 , "Современники", 1947);
        PrintEdition book2 = new Book("1984", author2, "Фантастика", 1949);
        PrintEdition book3 = new Book("Война и мир", author3, "Классика", 1865);
        PrintEdition book4 = new Book("Путешествие в Элевсин", author4, "Современники", 2023);
        PrintEdition book5 = new Book("Евгений Онегин", author5, "Классика", 1831);
        PrintEdition book6 = new Book("Дисгардиум", author6, "Фантастика", 2018);
        PrintEdition book7 = new Book("Руслан и Людмила", author5, "Классика", 1820);

        LibraryView library = new LibraryView();
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);
        library.addBook(book6);
        library.addBook(book7);
    
        System.out.println(library.getLibrary(null));

    }
}

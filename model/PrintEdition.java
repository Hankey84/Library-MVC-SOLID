package model;

public abstract class PrintEdition {
    private static int number;
    protected String title;
    protected int year;
    protected int id;

    static {
        number = 0;
    }

    public PrintEdition(String title, int year) {
        this.id = ++number;
        this.title = title;
        this.year = year;
    }

    // public PrintEdition() {

    // }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public int getID() {
        return id;
    }

}

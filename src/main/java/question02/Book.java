package question02;

public class Book {

    private String name;
    private Author author;
    private double cost;
    private int pages;
    private int bookNumber;

    public Book(String name, Author author, double cost, int pages, int bookNumber) {
        this.name = name;
        this.author = author;
        this.cost = cost;
        this.pages = pages;
        this.bookNumber = bookNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getBookNumber() {
        return bookNumber;
    }

    public void setBookNumber(int bookNumber) {
        this.bookNumber = bookNumber;
    }

    @Override
    public String toString() {
        return "Book Details : " +
                "name='" + name + '\'' +
                ", cost=" + cost +
                ", pages=" + pages +
                ", bookNumber=" + bookNumber;
    }
}

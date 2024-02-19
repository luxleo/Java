package extends1.ex;

public class Book extends Item{
    String isbn;
    String author;

    public Book(String name, int price, String isbn, String author) {
        super(name, price);
        this.isbn = isbn;
        this.author = author;
    }

    @Override
    protected void print() {
        super.print();
        System.out.println("- isbn : "+isbn + " author : "+author);
    }
}

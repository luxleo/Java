package constructor.ex;

public class Book {
    String title;
    String author;
    int price;

    // 생성자 오버로딩을 통하여 불필요한 중복을 줄인다.
    Book(){
        this("", "", 0);
    }

    Book(String title, String author) {
        this(title, author, 1000);
    }

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
}

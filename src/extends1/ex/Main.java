package extends1.ex;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("java programming", 10000, "1234-1234", "dong");
        Album album = new Album("good musics", 15000, "dong han");
        Movie movie = new Movie("great movie", 20000, "dong", "jung");

        book.print();
        album.print();
        movie.print();

        int sum = 0;
        sum+= book.getPrice();
        sum += album.getPrice();
        sum += movie.getPrice();

        System.out.println("sum = " + sum);
    }
}

package extends1.ex;

public class Album extends Item{
    String artist;

    public Album(String name, int price, String artist) {
        super(name, price);
        this.artist = artist;
    }

    @Override
    protected void print() {
        super.print();
        System.out.println("- artist = " + artist);
    }
}

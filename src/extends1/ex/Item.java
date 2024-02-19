package extends1.ex;

public class Item {
    protected String name;
    protected int price;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    protected void print() {
        System.out.println("name = " + name + " price = "+price);
    }

    public int getPrice() {
        return price;
    }
}

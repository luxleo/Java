package access.ex;

public class Item {
    private String name;
    private int price;
    private int quantity;

    public Item(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void showItemInfo() {
        System.out.println(String.format("name : %s, price : %d, quantity : %d",
                name,price,quantity));
    }
    public int getTotalPrice() {
        return price * quantity;
    }
}

package access.ex;

public class CartMain {
    public static void main(String[] args) {
        Item apple = new Item("apple", 10, 1000);
        Item banana = new Item("banana", 10, 1000);
        Item grape = new Item("grape", 10, 1000);

        Cart cart = new Cart(10);
        cart.addItem(apple);
        cart.addItem(banana);
        cart.addItem(grape);

        cart.showItems();
        cart.getTotalPrice();
    }
}

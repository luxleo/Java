package access.ex;

public class Cart {
    private Item[] items;
    private int maxCapacity;
    private int cnt;

    public Cart(int maxCapacity) {
        this.maxCapacity = maxCapacity;
        items = new Item[maxCapacity];
    }

    public void addItem(Item item) {
        // 검증 로직
        if (cnt >= maxCapacity) {
            System.out.println("더이상 담을 수가 없네요");
            return;
        }
        items[cnt++] = item;
    }

    public void showItems() {
        for (int i = 0; i < cnt; i++) {
            Item item = items[i];
            item.showItemInfo();
        }
    }
    public void getTotalPrice() {
        int total = 0;
        for (int i =0; i<cnt; i++) {
            Item item = items[i];
            total += item.getTotalPrice();
        }
        System.out.println("total = " + total);
    }
}

package jd07_practice;

public class ItemClient {

    public static void main(String[] args) {

        Item item = new Item();

        item.itemName = "Computer";
        item.unitPrice = 10_000;
        item.quantity = 1;

        System.out.println("Item name: " + item.itemName);
        System.out.println("Unit price: " + item.unitPrice);
        System.out.println("Quantity: " + item.quantity);

        item.calCost();
        System.out.println(item);

    }
}

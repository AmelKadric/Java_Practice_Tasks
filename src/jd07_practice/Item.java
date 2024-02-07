package jd07_practice;

public class Item {

    public String itemName;
    public double unitPrice;
    public int quantity;

    @Override
    public String toString() {
        return "Item{" +
                "itemName='" + itemName + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                '}';
    }

    public void calCost(){
        System.out.println("the item cost is: " + unitPrice);

    }


}

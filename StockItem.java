public class StockItem {
private String description;
private int itemId;
private static int id;
private float price;
private int quantity;

StockItem(){
    description = null;
    itemId = id++;
    price = 0;
    quantity = 0;
}
StockItem(String d, float p, int q){
    description = d;
    itemId = id++;
    price = p;
    quantity = q;
}
public String getDescription(){return description;}
public int getID(){return itemId;}
public float getPrice(){return price;}
public int getQuantity(){return quantity;}
public void setPrice(int price){
    if (price < 0){
        System.out.println("Error!");
    } else {
        this.price = price;
    }
}
public void lowerQuantity(int quantity) {
    int f = this.quantity - quantity;
    if (f < 0) {
        System.out.println("Error!");
    } else {
        this.quantity = this.quantity - quantity;
    }
}
public void raiseQuantity(int quantity){this.quantity = this.quantity + quantity;}
public String toString(){
    return "Item Number: " + itemId + "\n" + "Description: " + description + '\n' + "Price: " + price + '\n' + "In stock: " + quantity;
}



}

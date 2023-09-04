import java.util.ArrayList;
import java.util.Arrays;

public class Order {
    private int orderID;
    private static int nextAvailableID = 1;
    public boolean ready;
    public String[] items;
    Order(){
        orderID = nextAvailableID;
        nextAvailableID++;
        ready = false;
        items = new String[3];
    }
    Order(String[] s){
        orderID = nextAvailableID;
        nextAvailableID++;
        ready = false;
        items = s;
    }
    public int getID(){
        return orderID;
    }

    public String toString() {
        String foodReady;
        //String f= "Order ID: " + orderID;
        if (ready){
            foodReady = "Ready";
        } else {
            foodReady = "Not Ready";
        }
        return "OrderID: " +  orderID + "\n" + foodReady + "\n" + Arrays.toString(items);
    }
    public static void main(String args[]){
        Order s1=new Order();
        Order s2=new Order();

    }
}

import java.util.Scanner;

public class driver {
    public static void main(String args[]){
       OrderList[] restaurantOrders = new OrderList[10];
       Scanner scan = new Scanner(System.in);
        int oc;
        String ocs;
       do {
           System.out.println("1- Create order");
           System.out.println("2- Delete order");
           System.out.println("3- Ready order");
           System.out.println("4- Print order");
           System.out.println("5- Print all orders");
           System.out.println("6- Exit");

           oc = scan.nextInt();
           scan.nextLine();

           if (oc == 1){
                String[] oda = new String[3];
                System.out.print("Enter item 1: ");
                ocs = scan.nextLine();
                oda[0] = ocs;
                System.out.print("Enter item 2: ");
                ocs = scan.nextLine();
                oda[1] = ocs;
                System.out.print("Enter item 3: ");
                ocs = scan.nextLine();
                oda[2] = ocs;
                Order order = new Order(oda);
                addOrder();
           } else if (oc == 2) {
               System.out.println("What is your Order ID");
               oc = scan.nextInt();
               scan.nextLine();
               removeOrder(oc);
               System.out.println("Order has been removed");
           } else if (oc == 3){
               System.out.println("What is your Order ID");
               oc = scan.nextInt();
               scan.nextLine();
               readyOrder(oc);
               System.out.println("Order has been set to 'Ready'");
           } else if (oc == 4){
               System.out.println("What is your Order ID");
               oc = scan.nextInt();
               scan.nextLine();
               printOrder(oc);
               if (printOrder(oc).equals("")){
                   System.out.println("No order with such id");
               } else {
                   System.out.println(printOrder(oc));
               }
           } else if (oc == 5){

           }
       } while (oc != 6);
    }
}

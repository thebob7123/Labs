import java.util.Scanner;

public class driverstore {
    public static void main(String args[]) {
        StockItem milk = new StockItem("1 Gallon of Milk", 3.60F, 15);
        StockItem bread = new StockItem("1 Loaf of Bread", 1.98F, 30);
        Scanner scan = new Scanner(System.in);
        int read;
        do {
            System.out.println("1. Sold One Milk");
            System.out.println("2. Sold One Bread");
            System.out.println("3. Change price of Milk");
            System.out.println("4. Change price of Bread");
            System.out.println("5. Add Milk to Inventory");
            System.out.println("6. Add Bread to Inventory");
            System.out.println("7. See Inventory");
            System.out.println("8. Quit");
            read = scan.nextInt();
            scan.nextLine();
            if (read == 1){
                milk.lowerQuantity(1);
                System.out.println(milk.getQuantity());
            } else if (read == 2) {
                bread.lowerQuantity(1);
                System.out.println(bread.getQuantity());
            } else if (read == 3){
                System.out.println("What would you like the new price of milk to be?");
                read = scan.nextInt();
                scan.nextLine();
                milk.setPrice(read);
                System.out.println(milk.getPrice());
            } else if (read == 4){
                System.out.println("What would you like the new price of bread to be?");
                read = scan.nextInt();
                scan.nextLine();
                bread.setPrice(read);
                System.out.println(bread.getPrice());
            } else if (read == 5){
                System.out.println("What quantity of milk are you adding?");
                read = scan.nextInt();
                scan.nextLine();
                milk.raiseQuantity(read);
                System.out.println(milk.getQuantity());
            } else if (read == 6){
                System.out.println("What quantity of bread are you adding?");
                read = scan.nextInt();
                scan.nextLine();
                bread.raiseQuantity(read);
                System.out.println(bread.getQuantity());
            } else if (read == 7){
                System.out.println(milk);
                System.out.println(bread);

            }
        } while (read != 8);
    }
}

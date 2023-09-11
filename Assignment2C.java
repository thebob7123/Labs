import java.util.Scanner;

public class Assignment2C {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int numb;
        int numb2;
        int numb3;
        int numb4;
        System.out.print("Enter X Coordinate (bottom-left corner): ");
        numb = scan.nextInt();
        scan.nextLine();
        System.out.print("Enter Y Coordinate (bottom-left corner): ");
        numb2 = scan.nextInt();
        scan.nextLine();
        System.out.print("Hit Box Width: ");
        numb3 = scan.nextInt();
        scan.nextLine();
        System.out.print("Hit Box Height: ");
        numb4 = scan.nextInt();
        scan.nextLine();
        System.out.println("[Sprite Hit Box Coordinates]");
        System.out.println("Bottom-Left: " + numb + ", " + numb2);
        System.out.println("Top-Left: " + numb + ", " + (numb2 + numb4));
        System.out.println("Bottom-Right: " + (numb + numb3) + ", " + numb2);
        System.out.println("Top-Left: " + (numb + numb3) + ", " + (numb2 + numb4));
    }
}
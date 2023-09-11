import java.util.Scanner;
public class Assignment2A {
    public static double octagonArea(double i){
        double l = Math.sqrt(2);
        double s = i * i;
        double n;
        n = 1 + l;
        n = 2 * n;
        n = s * n;
        return n;
    }
    public static double octagonPerimeter(double i){
        double p = i * 8;
        return p;
    }
    public static double cylinderArea(double r, double h){
        double l = r * r;
        double dos = 2 * Math.PI;
        double f = dos * r;
        f = f * h;
        f += dos * l;
        return f;
    }
    public static double cylinderPerimeter(double r, double h){
        double k = r * 4;
        double j = h * 2;
        double p = k + j;
        return p;
    }
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        double read;
        double read2;
        System.out.println("1. Octagon");
        System.out.println("2. Cylinder");
        read = scan.nextDouble();
        scan.nextLine();
        if (read == 1){
            System.out.print("Side Length: ");
            read = scan.nextDouble();
            scan.nextLine();
            System.out.println("Area: " + octagonArea(read));
            System.out.println("Perimeter: " + octagonPerimeter(read));

        } else {
            System.out.println("Radius: ");
            read = scan.nextDouble();
            scan.nextLine();
            System.out.println("Height: ");
            read2 = scan.nextDouble();
            scan.nextLine();
            System.out.println("Area: " + cylinderArea(read,read2));
            System.out.println("Perimeter: " + cylinderPerimeter(read, read2));
        }
    }
}
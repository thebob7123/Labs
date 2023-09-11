import java.util.Scanner;

public class Assignment2B {
    public static int second(int s) {
        int sec = s % 60;
        return sec;
    }
    public static int minute(int m) {
        int min = m / 60;
        Math.floor(min);
        return min;
    }

    public static int hour(int h) {
        int hour = h / 60;
        Math.floor(hour);
        return hour;
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int time;
        System.out.println("Seconds: ");
        time = scan.nextInt();
        System.out.println(second(time) + " seconds");
        System.out.println(minute((time)) + " minutes");
        System.out.println(hour(minute((time))) + " hours");
    }
}
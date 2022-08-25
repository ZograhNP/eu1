import java.util.Scanner;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("enter a:");
        int a = scan.nextInt();

        System.out.println("enter b:");
        int b = scan.nextInt();

        if(a >= 1000|| b >= 1000) {
            System.out.println("enter number < 1000");
        }
        else {
            double c = Math.pow(a, 2) + Math.pow(b, 2);
            System.out.println(c);

        }
    }

}

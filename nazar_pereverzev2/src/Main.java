import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("enter number:");

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        int result = num + 1;
        System.out.println("Next num for the number "+ num +  " is " + result);

        int result1 = num - 1;
        System.out.println("Prev num for the number "+ num +  " is " + result1);
    }

}
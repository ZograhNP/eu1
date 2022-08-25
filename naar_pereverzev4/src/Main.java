import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int res;

        System.out.println("Enter numb of children:");
        Scanner scaner = new Scanner(System.in);
        int N = scaner.nextInt();
        System.out.println("Enter numb of apple:");
        int K = scaner.nextInt();

            res = K % N;
            System.out.println("Result: " + res);
        }
    }

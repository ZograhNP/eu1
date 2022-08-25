import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        int res = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter numb. of children: ");
        int N = scanner.nextInt();
        System.out.println("Enter numb. of apple: ");
        int K = scanner.nextInt();

        res = N / K;
        System.out.println("Result: " + res);
    }

}

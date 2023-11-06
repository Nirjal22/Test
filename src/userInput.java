import java.util.Scanner;

public class userInput {
    public static void main(String[] args) {
        System.out.println("It works!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number");
        int a1 = sc.nextInt();
        System.out.println("Enter your second number");
        int a2 = sc.nextInt();
        System.out.println("The sum of these numbers are:");
        int a3 = a1 + a2;
        System.out.println(a3);
        sc.close();
    }
}
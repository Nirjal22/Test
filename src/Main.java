import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Simple calculator");
        Scanner M = new Scanner(System.in);
        System.out.println("Select the method that you want to do.");
        char key;
        key = M.next().charAt(0);
        System.out.println("Enter the first number: ");
        double a = M.nextInt();
        System.out.println("Enter the second number: ");
        double b = M.nextInt();

        switch (key) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                System.out.println(a / b);
                break;

            default:
                break;
        }
        M.close();
    }
}
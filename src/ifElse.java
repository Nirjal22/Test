import java.util.Scanner;

public class ifElse {
    public static void main(String[] args) {
        Scanner NB = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = NB.nextInt();
        System.out.println("Enter the second number: ");
        int b = NB.nextInt();
        if (a>b){
            System.out.println("First input is greater than second input.");
        } else{System.out.println("Second input is greater than first input.");}
        NB.close();
    }
}

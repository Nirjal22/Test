import java.util.Scanner;

public class practice {
    static void smallestNumber(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double a = s.nextDouble();
        System.out.println("The first number: "+a);
        System.out.println("Enter the second number: ");
        double b = s.nextDouble();
        System.out.println("The second number: "+b);
        System.out.println("Enter the third number: ");
        double c = s.nextDouble();
        System.out.println("The third number: "+c);
        try {
            if (a>b){
                System.out.println(a + " is greater than "+ b + " & "+ c);
            } else if (b>c) {
                System.out.println(b + " is greater than "+ c + " & "+ a);
            }else{
                System.out.println(c + " is greater than "+ a + " & " + b);
            }
        }catch (Exception e){
            System.out.println("Invalid input!");
        }
        finally {
            System.out.println("Program run successfully");
        }
        s.close();
    }
    public static void main(String[] args) {
        smallestNumber();
    }
}

import java.util.Scanner;

public class practiceLoops {
    public static void main(String[] args) {
        int sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a = s.nextInt();
        try {
            for (int i = 0; i<=a; i++) {
                if (i%2 ==0){
                    sum = sum + i;
                }
            }System.out.println("The sum the even numbers below the entered value is " +sum);
        }catch (Exception e){
            System.out.println(e);
        }finally {
            System.out.println("Program Successfully done!");
        }
        s.close();
    }
}
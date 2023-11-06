import java.util.Scanner;

public class multiplicationTable {
    public static void main(String[] args) {
        int Ans = 0;
        System.out.println("Multiplication Table");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        System.out.println("The multiplication table of the entered number i.e." + a + "is:");
        for (int i = 1; i <= 10; i++) {
            Ans = a * i;
            System.out.println(a+ "*" + i + "=" + Ans);
        }
        s.close();
    }
}
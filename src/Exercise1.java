//Percentage of the students (5 subjects)

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        System.out.println("Hello! Students.");
        System.out.println("Enter the marks of 5 subjects: ");
        Scanner S = new Scanner(System.in);
        double Fst = S.nextDouble();
        double Snd = S.nextDouble();
        double Trd = S.nextDouble();
        double Frth = S.nextDouble();
        double Fth = S.nextDouble();
        double sum = Fst + Snd + Trd + Frth + Fth;
        double average = (sum) / 500 * 100;
        System.out.println("The percentage of the student is: ");
        System.out.println(average);
        System.out.println("Program complete!");
        S.close();
    }
}
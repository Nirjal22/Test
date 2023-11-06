//Check if the value entered by the user is integer or not.

import java.util.Scanner;

class practiceSet {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner SS = new Scanner(System.in);
        System.out.println(SS.hasNextInt());
        SS.close();
    }
}
// (hasNextInt()) is used to check if the inserted input is integer or not.
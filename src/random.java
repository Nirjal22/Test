import java.util.Scanner;

class random{
    public static void main(String[] args){
        System.out.println("Enter the amount of salary: ");
        Scanner S = new Scanner(System.in);
        float income = S.nextFloat();
        float tax = 0;
        try{
            if (income < 2.5f){
                System.out.println("No need to pay tax");
            } else if (income >2.5f && income <5.0f) {
                tax = tax + 0.05f * (5.0f - 2.5f);
                tax = tax + 0.02f *(income - 2.5f);
            } else if (income >5.0f && income <10.0f) {
                tax = tax + 0.1f*(income - 2.5f);
            }
            System.out.println("The amount of tax that the employee needs to pay is:" + tax);
        }catch (Exception e){
            System.out.println("Invalid input! please enter something valid.");
        }
        finally {
            System.out.println("Program completed!");
        }
        S.close();
    }
}

//the logic to pay the tax might be wrong because I don't know the formula to do that equation.
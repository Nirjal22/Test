import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
//        String name = new String("Nirjal");
        String name = "Nirjal Bista";
        System.out.print("The name of the person is: ");
        System.out.println(name);
        int a4 = 100;
        char A1 = 'N';
        float f1 = 200f;
        String H1 = "Rocky";
//        double d1 = 50.55; (I don't think there's a way to get output of double using this method.)
        System.out.printf("sting: %S and int: %d and float: %f and char: %c.",H1,a4,f1,A1);
        Scanner st = new Scanner(System.in);
        String a = st.toString();
        System.out.println(a);
        String txt = "Hi! My name is Nirjal Bista.";
        System.out.println("The length of the string is: " + txt.length()); //length() is used to calculate the length of the elements inside string.
        System.out.println(txt.toUpperCase()); //To uppercase
        System.out.println(txt.toLowerCase()); //To lowercase
        System.out.println(txt.indexOf("Nirjal")); //indexof() to locate the values in String
        //Concatenation
        String mm = "Peter";
        String mn = "Parker";
        System.out.println(mm +" "+mn);
        System.out.println(mm.concat(mn)); //concat() is use to add two string OUTPUT: (PeterParker) i.e. no spaces.
        System.out.println();
        System.out.println("it\'s not okay to be \"Vikings\" in this dramatic world\\.");
        st.close();
    }
}
// Strings are immutable and they cannot be changed.
/*System.out.printf("", )
*  %d for int
* %f for float
* %c for char
* %s for String
* */
//print different types of shapes.
public class Loops {
    public static void main(String[] args) {
        // Outer loop
        for (int i = 0; i < 5; i++) {
            // Inner loop for spaces
            for (int j = 5; j > i + 1; j--) {
                System.out.print(" ");
            }
            // Inner loop for asterisks
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int l=4; l>0;l--){
            for (int m=0;m<l;m++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        for (int n=0;n<5;n++) {
            for (int o = 0; o < n; o++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
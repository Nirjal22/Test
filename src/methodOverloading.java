//This is overloading of a parameter. Overloading means using the name name of the function but assigning the different value.
public class methodOverloading{
    static int over1(int x, int y){
        int z = x+y;
        System.out.println(z);
        return z;
    }
    static double over1(double x, double y){
        double z = x+y;
        System.out.println(z);
        return z;
    }
    public static void main(String[] args) {
        over1(10, 15);
        over1(200.55, 155.65);
    }
}

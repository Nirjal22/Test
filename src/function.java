public class function{
    static int logic(int x , int y){
        int z;
        if(x>y){
            z=x+y;
        }else{
            z=(x+y)*5;
        }
        return z;
    }
    //parameters
    static void para(String fname , int age){
        System.out.println(fname + " It's my name & " + age );
    }
    public static void main(String[] args) {
        int a = 2;
        int b = 1;
        int c = logic(a, b);
        System.out.println(c);
        int a1 = 100;
        int b1=200;
        int c1 = logic(a1, b1);
        System.out.println(c1);
        //calling parameters
        para("Nirjal",17);
        para("Mohit",16);
        para("Kaley",11);
    }
}
//There can be infinity numbers of parameters. 
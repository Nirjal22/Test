public class array {
    public static void main(String[] args) {
        String[] cars = {"Volvo", "Mazda", "Porche"};
        int[] myNum = {22, 5, 10};
        System.out.println(cars[0]);
        cars[0] = "BMW";
        System.out.println(cars[0]);
        System.out.println(cars.length);
//        loops through the array
        for (int i=0;i<myNum.length;i++){
            System.out.println(myNum[i]);
        }
//        Multidimensional Array- Array of an arrays.
        int[][] num = {{5,4,3,2,1},{6,7,8,9,10}};
        System.out.println(num[0][2]);
        System.out.println(num[1][2]);
//        Loops in multidimensional array
        for (int i = 0;i<num.length;i++){
            for (int j = 0;j<num[i].length;j++){
                System.out.println(num[i][j]);
            }
        }
    }
}

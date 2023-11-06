class Pen{
    String Color;
    String type;//gellpoint, ballpoint
    public void Write(){
        System.out.println("Write !");
    }
    public void printcolor(){
        System.out.println(this.Color);
    }
}
class employee{
    String name;
    Double Salary;
    String post;
    int age;
    public void show(){
        System.out.println("The name of the employee is " + this.name);
        System.out.println(this.Salary);
        System.out.println(this.post);
        System.out.println(this.age);
    }
}
public class OOP {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.Color = "red";
        pen1.type = "ballpoint";
        pen1.Write();

        Pen pen2 = new Pen();
        pen2.Color = "Blue";
        pen2.type = "Gellpoint";
        pen1.printcolor();
        pen2.printcolor();

        employee e1 = new employee();
        e1.name = "Nirjal";
        e1.Salary = 15000.057;
        e1.post = "HR Manager";
        e1.age = 18;
        e1.show();
    }
}

class Pen {
    String color;
    String type;//ballpoint;gel

    public void write() {
        System.out.println("Writing Something");
    }

    public void printColor() {
        System.out.println(this.color);
    }
}

class Student1 {
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }
}

public class Oops {
    public static void main(String[] args) {
//        Pen pen1=new Pen();//Creating an object
//        pen1.color="blue";
//        pen1.type="gel";
//        pen1.write();
//
//        Pen pen2=new Pen();
//        pen2.color="black";
//        pen2.type="ballpoint";
//
//        pen1.printColor();
//        pen2.printColor();


        Student1 s1 = new Student1();//here student is a constuctor()
        s1.name="Sayam";
        s1.age=15;

        s1.printInfo();
    }
}
//compile time Polymorphism
class Studnt{
    String name;int age;

    public void printinfo(String NAME){
        System.out.println(NAME);
    }

    public void printinfo(int AGE) {
        System.out.println(AGE);
    }

    public void printinfo(String NAme, int AgE){
        System.out.println("My age is "+NAme + " and my age " + AgE);
    }
}

    public class Polymorphism {
    public static void main(String[] args) {
        Studnt s1 = new Studnt();
        s1.name="Sayam";
        s1.age=22;

        s1.printinfo(s1.age);
        s1.printinfo(s1.name);
        s1.printinfo(s1.name,s1.age);
    }
}
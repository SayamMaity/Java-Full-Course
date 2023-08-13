//Data hiding is the process of protecting members of class from unintended changes whereas,abstraction is hiding the implementation details and showing only important/useful parts to the user

abstract class Animal{//abstarct is jst a imaginary concept ,not in real life
    abstract void walk();
    Animal(){
        System.out.println("You are creatng a Horse");
    }
public void eat(){
    System.out.println("Animal eats");
}
}

class Horse extends Animal{
    Horse(){
        System.out.println("Created a Horse");
    }
    public void walk() {
        System.out.println("walks on 4 legs");
    }
}

class Chicken extends Animal{
    public void walk() {
        System.out.println("walks on 2 legs");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Horse horse = new Horse();
//        horse.walklll
    }
}
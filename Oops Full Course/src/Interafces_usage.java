interface Animl{
    int eyes=2;
    void walk();
    //Animl{}//in interface we can't use interfacces

//   void est(){
//
//    }//implemented  functions are not allowed
}

interface Herbivore{

}
    class Horrse implements Animl,Herbivore{//Multiple Inheritance
        public void walk(){
            System.out.println("walks on 4 legs");
    }
    }


public class Interafces_usage {
    public static void main(String[] args) {
        Horrse horrse = new Horrse();
        horrse.walk();
    }
}

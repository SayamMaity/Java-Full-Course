import java.sql.SQLOutput;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//The keyword new is used to create a new object, and in this case, it creates an instance of the Scanner class. An instance is like a specific copy of a blueprint. Think of a class as a blueprint for a house, and an instance as the actual house built based on that blueprint.
        System.out.println("Input your Age : ");
        //int age = sc.nextInt();
        float age=sc.nextFloat();
        System.out.println(age);

        //for taking string
        Scanner ab=new Scanner(System.in);
        System.out.print("Enter ur name : ");
        String name= ab.next();//it only takes token i.e single word for eg. after running the code typr"Sayam is a bad boy" onlu sayam will be print
        System.out.println(name);

        //for taking full sentance
        Scanner op= new Scanner(System.in);
        System.out.println("Enter the sentence : ");
        String sentence = op.nextLine();
        System.out.println(sentence);


    }
}

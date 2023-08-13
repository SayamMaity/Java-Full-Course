import java.util.Scanner;

public class Conditional_Statements {
    public static void main(String[] args) {
        boolean isSunup = true;
        if(isSunup == true){
            System.out.println("day");
        }
        else
            System.out.println("night");


        Scanner p = new Scanner(System.in);
        System.out.println("enter the age: ");
        int age=p.nextInt();
        if(age > 18){
            System.out.println("u r eligible to vote");
        }
        else{
            System.out.println("not eligible");
        }
    }
}

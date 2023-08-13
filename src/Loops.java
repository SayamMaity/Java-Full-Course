import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        //for loop
        for(int i=1;i<=100;i=i+1){
            System.out.println(i);
        }

        for(int i=100;i>=1;i=i-1){
            System.out.println(i);
        }

        //while loop
        int i=1;
        while (i<=10){
            System.out.println(i);
            i=i+1;
        }

        //do while loop
        int k=5;
        do {
            System.out.println(k);//first it prints then chceks the condition
            k=k-1;
        }while (k>=1);


        //exercise
        Scanner op= new Scanner(System.in);
        int number=0;
        do {
            System.out.println("input a no.");
            number=op.nextInt();
            System.out.print("here is ur no. : ");
            System.out.println(number);
        }while (number>=0);

        System.out.println("The end");
    }
}

import java.util.Scanner;

public class Mini_project {
    public static void main(String[] args) {
        int mynumber=((int)(Math.random()*100));
        int usrname=0;
        Scanner sc=new Scanner(System.in);
        do {
            System.out.println("Guess my number : ");
            usrname= sc.nextInt();

            if(usrname==mynumber){
                System.out.println("correct no.");
                break;
            }
            else if (usrname > mynumber){
                    System.out.println("ur no. is too large");
                }
            else {
                System.out.println("ur no. is too small");
            }
        }while(usrname>=0);
        System.out.println("my number was: "+ mynumber);
    }
}

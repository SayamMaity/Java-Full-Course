import java.util.Scanner;

public class Logical_operators {
    public static void main(String[] args) {
        //&& both conditions needs to be true
        int a= 30;
        int b=40;
        if (a<40 && b<50)
            System.out.println("both less than true");

//        if (a>40 && b<50)
//            System.out.println("both less than true");//nothing will be printed as 1 statement is false

        // || one of the statements need to be true
        if(a<50 || b>60)
            System.out.println("atleart one less than 50");

        // ! negative operator that is it will opposite the output
//        boolean isAdult=false;
//        if(isAdult)//it will automatically take isAdult == true
//            System.out.println("is adult");
//        else
//            System.out.println("not adult");

        boolean isAdult=false;
        if(!isAdult)//although the output should be not adult as above isAdult=false but ! opposites the output
            System.out.println("is adult");
        else
            System.out.println("not adult");

        //example of conditional statement with operators
        Scanner pr=new Scanner(System.in);
        System.out.println("Enter ur Price : ");
        int money=pr.nextInt();
        //pen=10,notebook=40
        if (money<10)
            System.out.println("u can't buy nothing and get more cash");
        else if (money>10 && money<50) {
            System.out.println("u can get 1 thing");
        }
        else {
            System.out.println("can get both");
        }


    }

}

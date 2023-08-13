public class Operators {
    public static void main(String[] args) {
        //arithmatic operators

//        int a=1;
//        int b=2;
////        int diff=a-b;
////        int mul=a*b;
//        double div= a /b;
////        System.out.println(diff);
////        System.out.println(mul);
//        System.out.println(div);//Both a and b are integers, so when you perform a / b, the division is done as integer division. In this case, 1 / 2 results in 0, and only then is the result stored in the double variable div. As a result, div is assigned the value 0.0.

        double a=1;
        double b=2;
        double div= a /b;
        double modulo=a%b;
        System.out.println(div);
        System.out.println(modulo);

        //assignment operators
        int num=1;
        num=num+1;
        //++num;
        num++;
        System.out.println(num);

        //for better explanation
        int numb=1;

//        System.out.println(++numb);//2
//        System.out.println(numb);//2

        System.out.println(numb++);//first print the original value that is 1 then incement it
        System.out.println(numb);//2


        int number=1;

//        System.out.println(--number);//0
//        System.out.println(number);//0

        System.out.println(number--);//1
        System.out.println(number);//0
    }
}

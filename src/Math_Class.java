public class Math_Class {
    public static void main(String[] args) {
        //5,6
        System.out.println(Math.max(5,6));
        System.out.println(Math.min(5,6));

        //random
        System.out.println(Math.random());//provides random no. between 0.0 to 1.0 and it provides in long format

        //for making random in int type
        System.out.println((int)Math.random());//provides 0 as less than 1 is always 0

        System.out.println((int)(Math.random()*100));//provides random no. between 0 to 100
    }
}

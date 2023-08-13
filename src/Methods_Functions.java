public class Methods_Functions {
    public static void printjava(){
        System.out.println("hello java");
    }
    public static void printname(String name){
        System.out.println(name);
    }
    public static void add(int a, int b){
        int sum=a+b;
        System.out.println(sum);
    }

    public static void main(String[] args) {
//methods
        printjava();
        printname("sayam");
        printname("gopal");
        add(3,6);
    }
}

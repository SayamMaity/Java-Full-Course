public class Switch {
    public static void main(String[] args) {
        int day=1;//1= monday,2=tuesday

        switch (day){
            case 1:
                System.out.println("monday");
                break;//if we will not write break then after the case 1 matches after that also it will print case 2
            case 2:
                System.out.println("tuesday");
            default:
                System.out.println("wed - Sun");
        }
    }
}

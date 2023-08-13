package bank;
class Shape1{
    public void area() {
        System.out.println("displays area");
    }
}
class Triangle1 extends  Shape1 {
    public void area(int l, int h) {
        System.out.println(1/2*l*h);
    }
}


class Circle1 extends Shape1{
    public void area(int r) {
        System.out.println((3.14)*r*r);
    }
}

public class PackageUsage {
    public static void main(String[] args) {
        bank.Account account1 = new bank.Account();
        account1.name = "customer1";
    }

}
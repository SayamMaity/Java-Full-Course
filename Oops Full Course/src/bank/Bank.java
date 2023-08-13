package bank;
// Encapsulation means data and function ek hi entity like class mai kar dete hai
class Account{public String name;
    //String name;////public	Accessible from anywhere.
                  //private	Accessible only within the same class.
                 ////protected	Accessible within the same class, subclasses (same or other package), and same-package classes.
                  ////(default)	Accessible within the same package.
    protected  String email;//only subclasses and pakages can access this

    private String password;

    //getters & setters
//    public String getpassword(){
//        return this.password;
//}

    public void setpassword(String pass){
        this.password = pass;
    }

    //For setting the password by ourself and not letting the user to do that
    public String getpassword(){
//        setpassword("sayam");
        return this.password;
    }
//    private void setpassword(String pass){
//       this.password = pass;}



}

public class Bank {
    public static void main(String[] args) {
        Account account1 = new Account();
        account1.name = "Apna College";
        account1.email="apnacollege@gmail.com";
        account1.setpassword("abcd");
        System.out.println(account1.getpassword());

    }
}
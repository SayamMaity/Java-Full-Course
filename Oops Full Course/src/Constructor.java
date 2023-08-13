class Student {
    String fname;
    int fage;

    public void printInfo() {
        System.out.println(this.fname);
        System.out.println(this.fage);
    }


    //Non-Parameterize Constructor
//     Student() {
//        System.out.println("constructor called");
//    }



    //Parameterize Constructor
     Student(String name , int age) {
       /* this.fname = name;// this.fname is object's name and name is parameter in above student() that is constructor
        this.fage = age;*/
    }


    //Copy Cnstructor

    Student(Student s2){
        this.fname = s2.fname;
        this.fage = s2.fage;
}
Student(){}
}



public class Constructor {
    public static void main(String[] args) {

        //For non-parameterize Constructor
//       Student s1 = new Student();//here student is a constuctor()
//        s1.fname="Sayam";
//        s1.fage=15;
//        s1.printInfo();


        //For Prameterize Constructor
        /*Student s1 = new Student("Aman",19);
        s1.printInfo();*/

        //For Copy Constructor
        Student s1 = new Student();
        s1.fname = "Anindita";
        s1.fage = 40;

        Student s2 = new Student(s1);
        s2.printInfo();
    }
}
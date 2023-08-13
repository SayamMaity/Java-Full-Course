class Studnt6{
    String name;
    static String school;

    public static void changeschool(){
        school = "newschool";
}
}
public class Static {
    public static void main(String[] args) {
        Studnt6.school ="JMV";
        Studnt6 student = new Studnt6();
        student.name = "tony";
        System.out.println(student.school);
    }
}
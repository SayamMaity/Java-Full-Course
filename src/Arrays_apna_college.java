import java.sql.SQLOutput;
import java.util.Arrays;public class Arrays_apna_college {
    public static void main(String[] args) {
        int age=30;
        int physics=97;
        int chem=98;
        int eng=95;

//        int[] marks=new int[3];
//        marks[0]=98;
//        marks[1]=97;
//        marks[2]=92; // if we comment out the marks[0],[1],[2] then it will print 0 or null value same goes for primitive

        // boolean[] marks=new boolean[3];
        //marks[0]=98;
        //marks[1]=97;
        //marks[2]=92;

        // System.out.println(marks[0]);//it will print false as default value but if we not comment out the marks then it will show incompatible as boolean doesn't allow int and same goes for if we only comment out marks[0]

        //functions
        //length
        int[] marks=new int[3];
        marks[0]=98;
        marks[1]=97;
        marks[2]=92;
        System.out.println(marks.length);

        //sort
        System.out.println(marks[0]);
        Arrays.sort(marks);
        System.out.println(marks[0]);

//        if we know how many marks we need to store we might not need new
int[]marks1={97,98,95};

//2D arrays
        int[][]finalmarks={{97,98,99},{95,95,98}};
        System.out.println(finalmarks[0][2]);
        System.out.println(finalmarks[1][0]);
    }
}

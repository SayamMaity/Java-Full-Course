public class Strings {
    public static void main(String[] args) {
        //Concatenate
        String name1="Aman";
        String name2="Gupta";
        String name3=name1 + " and " + name2;
        System.out.println(name3);

        //CHarAt
        String namee="Aman";
        System.out.println(namee.charAt(1));

        //length
        String pi="Aman";
        System.out.println(pi.length());

        //Replace()
        String ho="Aman";
        String bhola=ho.replace('a','c');
        System.out.println(bhola);
        System.out.println(ho);//it prints Aman only as even after replacing it will not change the original file i.e "ho file" either it will create a new file that is "bhola file"

        //substring
        String guy="Akash and Akku";
        System.out.println(guy.substring(0,4));//0 is included but 4-1 will be there so 4 will be excluded

        //Index of some char
        String name="Aman";
        System.out.println(name.indexOf('a'));

        //String is immutable
    }
}

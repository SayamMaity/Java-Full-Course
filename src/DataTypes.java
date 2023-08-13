public class DataTypes {
    public static void main(String[] args) {
        //primitive for storing simple values
        //byte-1 byte[-128 to 127]
        //short-2
        //int -4 byte
        //long-8 byte
        //float-4 byte
        //double-8 byte
        //char-2 byte [a,b,c]
        //boolean-1 byte [true/false]
        byte age=30;
        int phone=1234567890;
        long phone2=12345678900L;//L for making the compiler realise that it is a big no like long no.
        float pi=3.14F;//F for making the compiler realise that it is a float no.
        char letter='@';
        boolean adult= true;


        //Non-primitive data types
        String nam1e="Arav singh";//in String new keyword is not required or say compulsory
        String name= new
                String("Appu");
        String friend=new String("Maity");
        System.out.println(name.length());
        System.out.println(nam1e);


    }
}

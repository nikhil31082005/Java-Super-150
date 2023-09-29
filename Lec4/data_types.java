package Lec4;

public class data_types {
    public static void main(String[] args) {
        //    two type of data_types
//    1. primitive  2. non-primitive
//    primitive --> byte,short,int,long,float,double,char(2 byte),boolean(1 bit)
        byte b = (byte)(447);
//    int a = 085;  // octal number can't contain 8 as a digit
        int a = 045;  // 37
        long ll = 2345678565l;  //default int
        float f = 9.7f;  // default double
        boolean k = true;  // total character in english is 256.  a --> 97 , A --> 65

        char ch = 'A';
        System.out.println((int)(ch));
        System.out.println(ch++);
//        ch = ch + 1;   error
        ch++;
        ch += 1;
        System.out.println(ch);
//        for(byte i=0;i<128;i++){
//            System.out.println(i);  // infinite loop
//        }
    }
}

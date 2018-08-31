package first;

/**
 * Created by expert on 6/29/18.
 */
public class StringExample {

    //String is a class in java.lang package. We dont have to import it since by default it is there
    public static void main(String[] args) {
        /*String s="Hello";//string literals
        String obj=new String("hello world");//String is  a default class
        String s1="hello";
        String s2=s.concat("world");
        System.out.println(s2);
        StringBuffer s3=new StringBuffer("java");
        s3.append("hi");
        System.out.println(s3);
        System.out.println(s.equals(s1));//or
        boolean b=s.equals(s1);
        System.out.println(b);
        boolean b1=s.equalsIgnoreCase(s1);
        System.out.println(b1);
        System.out.println(s==s1);*/
        String s="hello world ";
        String s1="kello";
        String s2="abc";
        String s3="bcd";
        String s4="BeF";
        System.out.println(s3.compareTo(s4));
        System.out.println(s4.toLowerCase());
        System.out.println(s);
        System.out.println(s.trim());
        System.out.println(s3.length());
        System.out.println(s.substring(0,5));
        System.out.println(s.substring(5,12));
        System.out.println(s.substring(5));
        System.out.println(s.charAt(1));


        //S
        String z="hi,hello,how,r u";
        String[] array=z.split(",");
        for (String obj:array) {
            System.out.println(obj);

        }
    }
}

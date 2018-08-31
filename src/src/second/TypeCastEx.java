package second;

/**
 * Created by expert on 7/9/18.
 */
public class TypeCastEx {
    public static void main(String[] args) {
      byte b=10;
      int x=b;//upcasting or implicit type casting//memory of int is 4 bit and that of byte is 1bit
        // so int can occupy byte
        int z=10;
        float f=z;
        float f1=1.0f;
        int i=(int)f1;//for occupying float in int //explicit type casting or down casting //from bigger to smaller
        int j=1;
        byte b1=(byte)j;
        long l=20;
        int in=(int) l;
      System.out.println(in);
        System.out.println(x);
        System.out.println(f);
        System.out.println(i);
        System.out.println(b1);


        //wrapper classes//We use wrapper classes for upcasting/downcasting
        //We can convert primitive data types to objects
        boolean b2=true;

         Integer i1=Integer.valueOf(x);//autoboxing{Primitive data type to object
         //OR
         Integer i3=new Integer(x);//autoboxing
        int u=i1;//unboxing//object to integer(primitive data type)
         Boolean obj=Boolean.valueOf(b2);
//         Float f2;
//         Double d;
//         Byte b2;
//         Long l;
        String s="123";
        String s1="True";
        String s2="rgggff";
        boolean b3=Boolean.valueOf(s2);
        Integer i2=Integer.parseInt(s);
        System.out.println(i2);
//        String s1="abc";
//        Integer i3=Integer.parseInt(s1);//Exception
        Float f3=Float.parseFloat(s);
        //Or
        Float f4=Float.valueOf(s);
        System.out.println(f4);
        System.out.println(f3);
       System.out.println(b3);

    }
}

package second;

/**
 * Created by expert on 7/5/18.
 */
public class C extends B {
    //Multi level inheritance
    public static void main(String[] args) {
        C obj=new C();
        System.out.println("Variable of class A :"+" "+obj.a+" "+"and"+" " +obj.b);
        System.out.println("Variable of class B :"+" "+obj.d+" "+"and"+" "+obj.e);
    }
}

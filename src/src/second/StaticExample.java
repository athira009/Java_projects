package second;

/**
 * Created by expert on 7/4/18.
 */
public class StaticExample {
    static int i=1;//Static objects are alloting to the same memory
    //int i=1;
    int j=1;//Not alloting to same memory, unique memory for unique objects

    StaticExample(){
        ++i;
        ++j;
        System.out.println(i+" "+j);
    }
    static class InnerStatic{//static class is always an inner class
       public void showMessage(){
           System.out.println("hello world");
       }
       public static void printfun(){
           System.out.println("static function of inner class");
       }
    }
    public static void display(){
        System.out.println("static function");//Static function can be invoked without creating objects
    }//only static variables can be called
    static { //Static blocks used to intialize static variables
        System.out.println("static block");//
    }

    public static void main(String[] args) {
        StaticExample s=new StaticExample();
        StaticExample s1=new StaticExample();
        StaticExample s2=new StaticExample();
        System.out.println(s.j);//for printing non static variables
        System.out.println(i);//or
        System.out.println(StaticExample.i);//for printing static variables
         display();
         InnerStatic.printfun();//for printing static function
         InnerStatic obj=new InnerStatic();
         obj.showMessage();//we have to create obj for printing non static function
    }
}

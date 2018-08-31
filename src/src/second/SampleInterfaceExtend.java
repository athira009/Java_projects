package second;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by expert on 7/6/18.
 */
public class SampleInterfaceExtend implements SampleInterface {//For extending interfaces
   static final int i;
   final int j=10;//We cannot assign values to final variables further
    static {
        i=1;//it is enough to declare static variables inside a static block
   }
    @Override
    public void add(int x,int y){
        System.out.println(x+y);
    }
    @Override
    public void display(){
        System.out.println("Hi");

    }

    public static void main(String[] args) {
        SampleInterfaceExtend s=new SampleInterfaceExtend();
        s.add(2,1);
        s.display();
        //s.x=1;
    }

}

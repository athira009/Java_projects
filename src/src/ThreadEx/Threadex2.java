package ThreadEx;

/**
 * Created by expert on 7/24/18.
 */


 class Thread1 extends Thread{
    sample s;
    Thread1(sample s) {this.s=s;}
    @Override
    public void run() {s.display(5);}

}
class Thread2 extends Thread{
    sample s;
    Thread2(sample s) {this.s=s;}
    @Override
    public void run() {s.display(6);}

}
public class Threadex2 {
    public static void main(String[] args) {
        sample s=new sample();
        Thread1 t1=new Thread1(s);
        Thread2 t2=new Thread2(s);
        t1.start();
        t2.start();

        sample s1=new sample();
        Thread1 t11=new Thread1(s1);
        Thread2 t22=new Thread2(s1);
        t11.start();
        t22.start();

    }
}

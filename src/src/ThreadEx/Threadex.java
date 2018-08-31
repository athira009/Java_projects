package ThreadEx;

/**
 * Created by expert on 7/24/18.
 */
public class Threadex extends Thread{
    @Override
    public void run(){
        System.out.println("thread in execution");
    }

    public static void main(String[] args) {
        Threadex t1=new Threadex();
        Threadex t2=new Threadex();
        t1.start();
        t2.start();
        System.out.println("main method");
    }

}

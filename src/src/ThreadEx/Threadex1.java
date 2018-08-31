package ThreadEx;

/**
 * Created by expert on 7/24/18.
 */
public class Threadex1 implements Runnable {
    @Override
    public void run(){
        for (int i=0;i<5;i++){
            System.out.println(Thread.currentThread().getName());
            System.out.println("thread in execution");
            System.out.println(i);
            try{
                Thread.sleep(1000);
                }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Threadex1 obj=new Threadex1();
        Thread t=new Thread(obj);
        t.setName("mythread2");
        t.start();
        System.out.println("main thread");
    }
}

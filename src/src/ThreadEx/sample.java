package ThreadEx;

/**
 * Created by expert on 7/25/18.
 */
public class sample {
    static synchronized public void display(int x){//static synchronized  blocks the whose class
        //synchronized (this){
        for (int i=0;i<3;i++){
            System.out.println(i*x);
        try{Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }//}
            System.out.println("rest of the code "+Thread.currentThread().getName());
        }
    }
}

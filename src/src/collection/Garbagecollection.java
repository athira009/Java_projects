package collection;


/**
 * Created by expert on 7/24/18.
 */
public class Garbagecollection {
    //DEAMOn
    @Override
    protected void finalize() throws Throwable{
        System.out.println("before garbage collection");
    }
    int x;

    public static void main(String[] args) {
        //System.gc();
        Garbagecollection g=new Garbagecollection();
        g=null;
        Garbagecollection g1=new Garbagecollection();
        g1=null;
        System.gc();
    }
}

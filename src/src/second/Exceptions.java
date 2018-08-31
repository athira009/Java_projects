package second;
import java.io.IOException;
/**
 * Created by expert on 7/9/18.
 */
public class Exceptions {
public static void check() throws IOException,ClassNotFoundException{
    throw  new IOException();
}
public static void callcheck() throws IOException,ClassNotFoundException {
    check();//Multiple exceptions can be defined using throws, but not by throw
}

    public static void main(String[] args) {
        try{
            callcheck();
        }catch (Exception e){
            System.out.println("checked exception");
        }
    }
}


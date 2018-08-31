package third;
import java.io.*;
import java.util.ArrayList;

/**
 * Created by expert on 7/19/18.
 */
public class New {
    public static void main(String[] args) throws IOException {
//For adding characters to list
        FileWriter fnew=new FileWriter("new.txt");
        fnew.write("athira");
        ArrayList<Character > al=new ArrayList<>();
       // fnew.flush();
        fnew.close();
        FileReader fn=new FileReader("new.txt");
        //System.out.println(fn.read());
        int ch1=0;
        while((ch1=fn.read())!=-1){
            //int s=ch1;
            al.add((char)ch1);

            System.out.println((char)ch1);

        }

        for (Character obj:al
             ) {
            System.out.println(obj);
        }

    }

}

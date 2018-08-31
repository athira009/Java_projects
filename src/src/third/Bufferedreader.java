package third;

import java.io.*;

/**
 * Created by expert on 7/18/18.
 */
public class Bufferedreader {
    public static void main(String[] args) throws IOException {
        System.out.println("input a line");
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));//For reading from console
        //BufferedReader reader1=new BufferedReader(new FileReader("third.txt"));
        //String s=reader1.readLine();//For reading from text file
        String line = reader.readLine();
        System.out.println(line);

    }
}

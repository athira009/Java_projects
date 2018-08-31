package third;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by expert on 7/19/18.
 */
public class SplittingandAdding {

    public static void main(String[] args) throws IOException {

        BufferedReader reader=new BufferedReader(new FileReader("split.txt"));
        String s=reader.readLine();

        String[] words=s.split(" ");
        ArrayList<String> al=new ArrayList<>();
        for (String obj:words
             ) {
            al.add(obj);
        }
        System.out.println(al);
}}



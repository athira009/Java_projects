package third;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by expert on 7/18/18.
 */
public class FileEX {
    public static void main(String[] args) throws IOException{
        FileOutputStream fout=new FileOutputStream("first.txt");
        //fout.write(22);
        String s="Hello Athira";
        byte[] b=s.getBytes();
        fout.write(b);
        fout.close();
        FileInputStream fin=new FileInputStream("first.txt");
        int temp=0;
        while ((temp=fin.read())!=-1){
            System.out.print((char)temp);
        }
        Pattern p= Pattern.compile("Hello");
        Matcher m=p.matcher("first.txt");
        while (m.find()){
            System.out.println("found "+m.group()+" starting at index "+m.start()+" "+"ending index at "+m.end());

        }
        //System.out.println(fin.read());//for reading file contents
    }

}

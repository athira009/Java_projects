package third;
import java.io.*;
/**
 * Created by expert on 7/18/18.
 */
public class FileEX1 {
    public static void main(String[] args) throws IOException {
        FileWriter fout=new FileWriter("second.txt");
        fout.write("Hello");
        fout.close();


        FileReader fin=new FileReader("second.txt");
        FileWriter fout1=new FileWriter("third.txt");
        int ch=0;
        while((ch=fin.read())!=-1){
        //System.out.println((char)ch);
        fout1.write(ch);
        }
        fout1.close();
        FileReader fin1=new FileReader("third.txt");
        //System.out.println(fin1.read());
        int ch1=0;
        while((ch=fin1.read())!=-1){
            System.out.println((char)ch);
        }

        //OR
//        int ch=0;
//        while((ch=fin.read())!=-1){
//        int s=ch;
//        fout1.write(s);}
//        fout1.close();
//        FileReader fin1=new FileReader("third.txt");
//        //System.out.println(fin1.read());
//        int ch1=0;
//        while((ch=fin1.read())!=-1){
//        System.out.println((char)ch);
//        }

    }}


import java.io.*;
import java.util.ArrayList;

/**
 * Created by expert on 8/13/18.
 */
public class Collection_File {
    int rollno;
    String name;
    int marks;

    public Collection_File(int rollno, String name, int marks) {
        this.rollno = rollno;
        this.name = name;
        this.marks = marks;
    }

    public static void main(String[] args) throws FileNotFoundException, Exception {
        BufferedReader br=new BufferedReader(new FileReader("a.txt"));
        ArrayList<Collection_File> list=new ArrayList<>();
        String str;
        while ((str=br.readLine())!=null){
           String[] x=str.split(",");
           list.add(new Collection_File(Integer.parseInt(x[0]),x[1],Integer.parseInt(x[2])));


        }
        for (Collection_File obj:list){
            System.out.println(obj.rollno+" "+obj.name+" "+obj.marks);
        }
    }
}

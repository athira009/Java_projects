package collection;
import jdk.nashorn.internal.objects.NativeArray;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/**
 * Created by expert on 7/10/18.
 */
public class Collections {
    public static void main(String[] args) {
        //generic declaration
        ArrayList<String> al=new ArrayList(); //Maintains insertion order  and can add duplicate elements
        List<String> al1=new ArrayList<>();
        ArrayList<String> al2=new ArrayList<String>();


        al.add("Athira");
        al.add("Ammu");
        al.add("Aswani");
        al.add(null);

        for (String obj:al
             ) {
            System.out.println(obj);

        }



        //Integer lists
        ArrayList<Integer> i=new ArrayList();
        i.add(1);
        i.add(2);
        i.add(3);
        //first method
        for (Integer obj:i
             ) {
            System.out.println(obj);
        }
        System.out.println(i);

        //second method
        Iterator itr=al.iterator();
        while (itr.hasNext()){//it.has next gives boolean values while itr.next gives object
            System.out.println(itr.next());
        }


        //third method

        for (int j=0;j<al.size();j++){
            System.out.println(al.get(j));
        }

        ArrayList<String> arraylist=new ArrayList<>();
        arraylist.add("Apple");
        arraylist.add("orange");
        arraylist.add("grapes");


        al.addAll(2,arraylist);//Merging two lists//index provides information about the position where merging starts
        //For removing particular element using its name or index
        al.remove(null);//or
        al.remove(5);
        for (String obj:al
                ) {
            System.out.println(obj);
        }

        ArrayList al3=new ArrayList();//non-generic //doesn't specify return data type
        al3.add("aa");
        al3.add(123);
        al3.add(1.0f);
        for (Object o:al3
             ) {
            System.out.println(o);

        }
        //OR
        System.out.println(al3);
    }
}

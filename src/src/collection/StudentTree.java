package collection;
import com.sun.istack.internal.NotNull;

import java.util.Iterator;
import java.util.TreeSet;
/**
 * Created by expert on 7/16/18.
 */
public class StudentTree implements Comparable<StudentTree>{
    String name;
    int age,rollno;

    public StudentTree(String name, int age, int rollno) {
        this.name = name;
        this.age = age;
        this.rollno = rollno;
    }

    public static void main(String[] args) {
        TreeSet<StudentTree> tree=new TreeSet();
        tree.add(new StudentTree("Athira",23,3));
        tree.add(new StudentTree("Aswani",22,2));
        Iterator itr=tree.iterator();
        while(itr.hasNext()){
            StudentTree t=(StudentTree) itr.next();
            System.out.println(t.name+t.age+t.rollno);
        }


}

    @Override
    public int compareTo(@NotNull StudentTree o) {
        if (rollno>o.rollno){
//            System.out.println(rollno);
//            System.out.println(o.rollno);
            return 1;
        }
        else if (rollno<o.rollno){
            //            System.out.println(rollno);
//            System.out.println(o.rollno);
            return -1;
        }
        else{
            //            System.out.println(rollno);
//            System.out.println(o.rollno);
            return 0;
        }

    }
}

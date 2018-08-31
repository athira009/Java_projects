package collection;
import java.util.LinkedList;
//
/**
 * Created by expert on 7/12/18.
 */
public class Linked {
    public static void main(String[] args) {
 //nodes
        //first and last element
        LinkedList<String> l=new LinkedList<>();
        l.add("AA");
        l.add("BB");
        l.addLast("CC");
        l.addFirst("DD");
        l.addFirst("EE");
        l.add(null);
        l.removeLast();
        l.removeFirst();
        for (String obj:l
             ) {
            System.out.println(obj);
        }
    }
}

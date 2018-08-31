package collection;

import java.util.ArrayDeque;

/**
 * Created by expert on 7/19/18.
 */
public class DequeArray {
    public static void main(String[] args) {
        ArrayDeque<String> obj=new ArrayDeque<String>();
        obj.addFirst("Athira");
        obj.addLast("Ammu");
        obj.add("Aswani");
        obj.add("adad");
        obj.add("wdc");
        System.out.println("head : " +obj.peek());//returns the first element
        System.out.println("removed first : "+obj.pollFirst());//remove and return first element and returns null if empty
        System.out.println("removed last : "+obj.pollLast());//remove and return last element and returns null if empty
        System.out.println("after removal : "+obj);
        System.out.println("remove :"+obj.remove());
        System.out.println(obj.removeFirst());//remove and return first element
        System.out.println(obj.removeLast());//remove and return last element
        System.out.println(obj);
    }
}

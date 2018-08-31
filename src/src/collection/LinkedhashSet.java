package collection;

import java.util.LinkedHashSet;

/**
 * Created by expert on 7/16/18.
 */
public class LinkedhashSet {
    //Maintains insertion order while Hashset does not
    //duplicate values cannot be added in set interfaces
    public static void main(String[] args) {


    LinkedHashSet<String> linked=new LinkedHashSet<>();
    linked.add("Anu");
    linked.add("Athira");
    linked.add(null);
        System.out.println(linked);

}}

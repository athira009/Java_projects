package collection;
import java.util.HashSet;
import java.util.LinkedHashSet;

/**
 * Created by expert on 7/12/18.
 */
public class Set {
    public static void main(String[] args) {
        HashSet<String> set=new HashSet<>();//Hashing mechanism //storing values as hash values
        set.add("BC");
        set.add("BB");
        set.add("CC");
        set.add(null);
        for (String obj:set
             ) {
            System.out.println(obj);
        }
        //OR
        System.out.println(set);
        LinkedHashSet<String> setex=new LinkedHashSet<>();
        setex.add("BC");
        setex.add("BB");
        setex.add("CC");
        setex.add(null);
        setex.add("CC");
        for (String obj:setex
                ) {
            System.out.println(obj);
        }
    }
}

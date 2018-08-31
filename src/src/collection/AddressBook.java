package collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by expert on 7/17/18.
 */
public class AddressBook {

    public static void remove(int x,HashMap<Integer,Person> h){
        h.remove(x);
    }
    public static void checkKey(int x,HashMap<Integer,Person> h){
        System.out.println(h.containsKey(x));
    }
    public static void displayDetails(HashMap<Integer,Person> h){
    for (Map.Entry<Integer,Person> obj:h.entrySet()
                 ) {
            //System.out.println(obj.getKey());
            System.out.println("Details of person with house no: "+obj.getKey());
            Person p=obj.getValue();
            System.out.println(p.name+" "+p.age+" "+p.address);
        }}
    public static void main(String[] args) {

        HashMap<Integer,Person> hmap=new HashMap<>();
        hmap.put(21,new Person("Athira",23,"Manalel"));
        hmap.put(13,new Person("Aswani",22,"Vaishnavi"));
        hmap.put(19,new Person("ADCC",34,"zsdc"));
        hmap.put(19,new Person("add",23,"ddff"));
        //System.out.println(hmap.containsKey(19));

        //System.out.println(hmap.containsKey(19));


//        for (Map.Entry<Integer,Person> obj:hmap.entrySet()
//             ) {
//            //System.out.println(obj.getKey());
//            System.out.println("Details of person with house no: "+obj.getKey());
//            Person p=obj.getValue();
//            System.out.println(p.name+" "+p.age+" "+p.address);
//        }
        remove(19,hmap);
        checkKey(21,hmap);
        displayDetails(hmap);
        checkKey(19,hmap);
    }
}
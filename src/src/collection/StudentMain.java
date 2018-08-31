package collection;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by expert on 7/17/18.
 */
public class StudentMain {
    public static void main(String[] args) {
        HashMap<Integer,Student> hmap=new HashMap<>();
//        hmap.put(3,"Athira");
//        hmap.put(2,"Aswani");
//        hmap.put(null,"BBB");
//        hmap.remove(2);
//
//        for (Map.Entry obj:hmap.entrySet()
//             ) {
//            System.out.println(" getting keys : " +" "+obj.getKey()+" "+" getting values :"+" "+obj.getValue()); //for getting keys
//            //System.out.println(obj.getValue());//for getting values
//        }
 //LinkedHashMap
//       hmap.put(3,new Student("Athira",23,"Manalel"));
//       hmap.put(2,new Student("Aswani",22,"Vaishnavi"));
//       hmap.put(12,new Student("Parthan",8,"Manalel"));
//
//        for (Map.Entry<Integer,Student>obj:hmap.entrySet()
//             ) {
//            System.out.println("rollno : "+obj.getKey());
//            System.out.println("Details of students : ");
//            Student s=obj.getValue();
//            System.out.println(s.name+" "+s.age+" "+s.address);
//
//            //Here getValue returns object of Student
//        }

        //TreeMap

        TreeMap<Integer,String > m=new TreeMap<>();
        m.put(1,"AAA");
        m.put(2,"BBB");
       // m.put(null,"CCC");
        for (Map.Entry<Integer,String> obj:m.entrySet()
             ) {
            System.out.println(obj.getKey());

        }

    }
}

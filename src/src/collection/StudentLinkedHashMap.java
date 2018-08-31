package collection;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by expert on 7/17/18.
 */
public class StudentLinkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<String,String> hmap=new LinkedHashMap<>();
        hmap.put("1","AAA");
        hmap.put("2","BBB");
        for (Map.Entry<String,String> obj:hmap.entrySet()
             ) {
            System.out.println(obj.getKey()+" "+obj.getValue());
        }
        System.out.println(hmap.containsKey("3"));//For checking that particular key is present or not
    }

}


package second;

/**
 * Created by expert on 7/9/18.
 */
import java.util.Arrays;
import java.util.StringTokenizer;

public class StringSplit {
    public static void main(String[] args) {
        String s="hi,hello,how,r u";
        char[] ch=s.toCharArray();//converting to character array
        for (char c:ch
             ) {
            System.out.println(c);

        }
        String[] array=s.split(",");
        for (String obj:array
             ) {
            System.out.println(obj);

        }

        Object[] a={1,"aa",10.0f};
        for (Object obj:a) {
            System.out.println(obj);
        }
        int[] a1={9,4,5,10};
        //Arrays[] a2=Arrays.sort(a1);
        System.out.println("element is at"+Arrays.binarySearch(a1,4));
        for (int obj:a1
             ) {
            System.out.println(obj);

        }
        StringTokenizer s1=new StringTokenizer(s,",");
           while (s1.hasMoreTokens()){
               System.out.println(s1.nextToken());
           }
    }
}

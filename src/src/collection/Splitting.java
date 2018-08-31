package collection;

/**
 * Created by expert on 8/14/18.
 */
public class Splitting {
    public static void main(String[] args) {
        int a[]={10,74,30,46,20,36,78,45,50};

        int len=a.length/2;
        int b[]=new int[len];
        int c[]=new int[a.length-len];
//        int b[]=new int[a.length/2];
//        int c[]=new int[a.length/2];
        for (int i=0;i<a.length/2;i++){
            b[i] = a[i];
        }
        for (int k=0;k<b.length;k++){
            System.out.println(b[k]);
        }
        int m=0;
        System.out.println("second");
        for (int i=(a.length/2);i<a.length;i++){
            c[m]=a[i];
            //System.out.println(c[m]);
            m++;
        }

        for (int l=0;l<c.length;l++){
            System.out.println(c[l]);
        }

}}

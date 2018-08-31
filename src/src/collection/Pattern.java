package collection;
import java.util.Scanner;
/**
 * Created by expert on 6/29/18.
 */
public class Pattern {
    public void printpattern(int n){
        for(int i=1;i<n;i++){
            for(int j=1;j<=i;j++){
                //System.out.print("*");

                System.out.print(i);
            }

            System.out.println("") ;
        }}

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        Pattern p = new Pattern();
        //p.printpattern(5);
        p.printpattern(n);
    }


}

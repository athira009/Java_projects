package first;
import java.util.Scanner;
/**
 * Created by expert on 6/28/18.
 */
public class Arithmetic {
    /*public void check(int year){
        if ((year%4==0)&&(year%100!=0)){
            System.out.println("it is a leap year");
        }
        else if (year%400==0){
            System.out.println("it is a leap year");
        }
        else {
            System.out.println("not leap year");
        }
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int year=s.nextInt();
        Arithmetic y=new Arithmetic();
        y.check(year);
    }*/

    public static void main(String[] args) {

        int a = 10;
        int b = 10;
        int c = 20;

        if (a == b) {
            if (c < a) {
                System.out.println("nested if");
            } else {
                System.out.println("nested else");
            }
        } else {
            System.out.println("else case");
        }
    }
}
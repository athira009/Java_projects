package second;
import java.util.Scanner;
/**
 * Created by expert on 6/27/18.
 */
public class Employee {
    public int add(int x, int y){
        return x+y;
    }
    public static void main(String[] args) {
        Department dep=new Department(2,"Mathematics");
        //dep.details();
        Scanner s=new Scanner(System.in);//System.in implies output can be compiled from system
        // Scanner is to read output from console
       System.out.println("read value from console");
        int a=s.nextInt();
        int b=s.nextInt();//line for string ,int for integer
        Employee e= new Employee();
        System.out.println(e.add(a,b));

        }
        //System.out.println(s.);
    }


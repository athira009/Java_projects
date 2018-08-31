import java.util.Random;

import static java.lang.Math.*;

/**
 * Created by expert on 7/26/18.
 */
public class Mathfunctions {
    public static void main(String[] args) {
        System.out.println(abs(-10));//absolute value
        //Or
        System.out.println(Math.abs(-2));//For non static functions
        System.out.println(max(2,22));
        System.out.println(pow(3,3));
        System.out.println(acos(1));
        System.out.println(Math.acos(-1));
        System.out.println(Math.asin(1));
        System.out.println(Math.atan(0));
        Random random=new Random();
        int num=random.nextInt(7);//less than bound any  no can be displayed

        System.out.println(num);

    }
}

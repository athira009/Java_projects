package first;

/**
 * Created by expert on 6/28/18.
 */
public class Operators {
    public static void main(String[] args) {
     //Increment operators
        /*int i=1;
        int j=++i;//pre increment operator
        int y=3;
        int k=y++;//increment operator
        int x=2;
        int l=--x;//decrement operator
        System.out.println(j);
        System.out.println(k);
        System.out.println(i);*/

    //Relational opertor
        /*int a=20,b=40;

        if (a==b){
            System.out.println(" a and b are equal");
        }
        else if (a<b){
            System.out.println(a+" "+" is less than "+" "+b);

        }
        else {
            System.out.println(a+" "+"is greater than "+" "+b);
        }*/

    //logical operator
        int a=20;
        int b=30;
        int c=40;
        if ((a!=b)&&(a==c)){
            System.out.println("Both conditions are satisfied");

        }

        else if((a!=b)||(a==c)){
            System.out.println("one of the conditions is true");
        }
        else{
            System.out.println("Not true");
        }

    }
}

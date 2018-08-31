package second;

import first.Arithmetic;

/**
 * Created by expert on 7/9/18.
 */
public class ExceptionEx {
    public static void add(int x,int y){
      int z=x+y;
      //Run time exception or unchecked exception
      if (z>50){
          throw new ArithmeticException("Not valid");
      }

    }


    public static void first(){
        second();
    }
    public static void second(){
        third();

    }
    public static void third(){
        throw new ArithmeticException("exception");
    }

    public static void main(String[] args) {
     try {
         add(20, 40);
     }catch (Exception e){
         System.out.println("Exception caught");
     }
     try{
         first();

     }catch (Exception e){
         System.out.println("exception caught");
     }//Above is called "propagation" which is possible only in unchecked exception, but not in checked exception
    }
}

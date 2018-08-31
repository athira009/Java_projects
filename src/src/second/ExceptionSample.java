package second;

/**
 * Created by expert on 7/6/18.
 */
public class ExceptionSample {
    public static void main(String[] args) {
        //For exception handling...Catch block
        String s=null;
        try {
            //s.length();
           try{
            int y = 2 / 0;//Arithmetic exception
              }catch (Exception e){
            System.out.println("exception caught");
        }}
        catch (Exception e){
            System.out.println("exception caught");
        }
        finally {
            System.out.println("finally block");
        }



//        }catch (Exception e ){
//            e.printStackTrace();//or Arithmetic exception
//            System.out.println("Exception caught");
//        }
//        catch (NullPointerException e){
//            System.out.println("Null pointer exception");
//        }
            System.out.println("rest of the code");
    }
}

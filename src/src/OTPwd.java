import java.util.Random;

/**
 * Created by expert on 8/13/18.
 */
public class OTPwd {
    public static void main(String[] args) {
        System.out.println(passwordmethod(10));
    }
      static char[] passwordmethod(int length){
        System.out.println("Generating password using random method...");
        System.out.println("your new password is :");
        String caps="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String small="abcdefghijklmnopqrstuvwxyz";
        String num="0123456789";

        String val=caps+small+num;

        Random r=new Random();

        char[] password=new char[length];
        for (int i=0;i<length;i++){
          password[i]=val.charAt(r.nextInt(val.length()));
        }
        return password;


    }


}

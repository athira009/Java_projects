package third;


import java.util.regex.Pattern;

/**
 * Created by expert on 7/20/18.
 */
public class RegexEx1 {
    public static void main(String[] args) {
        System.out.println(Pattern.matches("[\\D]{6}","aaaaaa"));//for alphabets
        System.out.println(Pattern.matches("[\\d]{6}","123456"));//for numbers
        System.out.println(Pattern.matches("[@&%]","@"));
        System.out.println(Pattern.matches("[12][a-zA-Z0-9@#$%]*","1nfmms#@"));
        System.out.println(Pattern.matches("[\\d][A-Z][\\D]{8}+","1A@#$%@#$@"));
        System.out.println(Pattern.matches("[\\w]+[@][a-z]+[.][c][o][m]","sobhaathira3@gmail.com"));
        System.out.println(Pattern.matches("[+][9][1][0-9]{10}","+919486509759"));
        System.out.println(Pattern.matches("[0-3][0-9][/][0-1][0-2][/][\\d]{4}","39/12/1994"));


/////////////OR//////////////////////////////////////////////////////////////
//        Boolean x=Pattern.matches("[\\w@#$%.]{10}","ira3@g.com");
//        Boolean y=Pattern.matches("[A-Za-z0-9@#$%.]+","ira3@g.com");
//        if (x&&y){
//            System.out.println(true);
//        }
//        else {
//            System.out.println(false);
//        }
///////////////////////////////////////////////////////////////////////////////////////////////////
//        System.out.println(Pattern.matches("[A-Za-z0-9@#$%.]+","sobhaathira3@gmail.com"));
    }
}

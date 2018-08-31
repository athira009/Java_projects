package third;

import java.util.regex.Pattern;

/**
 * Created by expert on 7/19/18.
 */
public class RegexEx {
    public static void main(String[] args) {
            boolean b= Pattern.matches("..b","abb");
        System.out.println(Pattern.matches("[abc]","a"));//either a,b or c
        System.out.println(Pattern.matches("[^abc]","z"));//if other than abc(not abc)
        System.out.println(Pattern.matches("[a-zA-Z]","A"));//a-z or A-Z
        System.out.println(Pattern.matches("[a-z]","a"));
        System.out.println(Pattern.matches("[a-d[m-p]]","n"));
        System.out.println(b);
}}

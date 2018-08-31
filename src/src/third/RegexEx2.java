package third;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by expert on 7/20/18.
 */
public class RegexEx2 {
    public static void main(String[] args) {
        Pattern p= Pattern.compile("java");
        Matcher m=p.matcher("hi java ,hello java");
        while (m.find()){
            System.out.println("found "+m.group()+" starting at index "+m.start()+" "+"ending index at "+m.end());

        }
    }
}

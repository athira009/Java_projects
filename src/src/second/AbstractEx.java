package second;

/**
 * Created by expert on 7/6/18.
 */
public abstract class AbstractEx
{
    public abstract void add(int x,int y);//implementation is hidden , only declaration is present

    public abstract String showMessage(String message);

    public void display(){
        System.out.println("non-abstract method of abstract class");
    }

}

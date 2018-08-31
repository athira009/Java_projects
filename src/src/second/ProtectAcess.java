package second;

/**
 * Created by expert on 7/5/18.
 */
public class ProtectAcess {
    protected int a;//Protected variables can be accessed only in same packages and its child classes
    protected void display(){

    }

    public static void main(String[] args) {
        ProtectAcess p=new ProtectAcess();
        p.a=1;
        p.display();
    }
}

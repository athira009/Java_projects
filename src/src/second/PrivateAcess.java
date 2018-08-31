package second;

/**
 * Created by expert on 7/5/18.
 */
public class PrivateAcess {
    public static void main(String[] args) {
//        AcessEx p=new AcessEx();
//        p.a=1;//Since a is private
//        p.display();//Even if function is public, it shows error since a is private.Also if function is
//                   //private

        AcessEx e=new AcessEx();
        e.setName("Athira");
        System.out.println(e.getName());
        e.setB(1);
        System.out.println(e.getB());
        ProtectAcess p=new ProtectAcess();
        p.a=1;
        p.display();
    }
}

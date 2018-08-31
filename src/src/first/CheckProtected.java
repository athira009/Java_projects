package first;
import second.ProtectAcess;
/**
 * Created by expert on 7/5/18.
 */
public class CheckProtected extends ProtectAcess {
//    public static void main(String[] args) {
//        ProtectAcess p=new ProtectAcess();
//        p.a=1;//Since a is protected
//        p.display();//Since function is protected
//    }
//}


//Check child class

//public class CheckProtected extends ProtectAcess{
    public static void main(String[] args) {
        CheckProtected p=new CheckProtected();
        p.a=1;//Since a is protected
        p.display();//Since function is protected
    }
}

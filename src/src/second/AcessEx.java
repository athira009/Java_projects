package second;

/**
 * Created by expert on 7/5/18.
 */
public class AcessEx { //it can be either public or default
//    public int a;  //public variables can be invoked anywhere
//    public void display(){  //public function, if nothing infront of "void" then function is default
//
//    }
//
//    public static void main(String[] args) {
//        AcessEx e=new AcessEx();
//        e.a=1;
//        e.display();
//    }



    //private variables
    private int a;  //Can be invoked in the same class only//check "PrivateAcess.java"
    private void display(){

    }
    //For accessing private variables
    private int b;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public static void main(String[] args) {
        AcessEx e=new AcessEx();
        e.a=1;
        e.display();
    }


}

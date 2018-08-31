package second;

/**
 * Created by expert on 7/3/18.
 */
public class Polymorphism {
    //Method over loading
    //compile time polymorphism
    /*public void display(String msg){
        System.out.println(msg);
    }
    public void display(){
        System.out.println("display");
    }

    public static void main(String[] args) {
        Polymorphism obj=new Polymorphism();
        obj.display();
        obj.display("hello");
    }*/



    public void area(float radius){
        float area = (float) (3.14*(radius*radius));
        System.out.println(area);
    }
    public void area(int length,int breadth){
        int area=length * breadth;
        System.out.println(area);
    }

    public static void main(String[] args) {
        Polymorphism obj =new Polymorphism();
        obj.area(3.0f);
        obj.area(2,3);
    }



}

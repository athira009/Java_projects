package second;
//Child class
/**
 * Created by expert on 7/3/18.
 */
public class B extends A{
int d=1;
int e=2;
B(){ //super();//by default
    System.out.println("Child class construtor");
}

    @Override
    public void display() {
        System.out.println("hello");//over writing parent class printing
        super.display();// to refer parent class
    }
    public int add(int x,int y){
        System.out.println("in child:"+x+y);
        return x+y;
    }

    public static void main(String[] args) {
      B obj=new B();
        System.out.println("Properties of parent class : "+obj.a+" "+obj.b); //Using the object in child class// we can use a part from parent class
        System.out.println("Properties of child class: "+obj.d+" "+obj.e);
        obj.add(2,3);
    }
}

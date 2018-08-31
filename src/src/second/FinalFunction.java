package second;

/**
 * Created by expert on 7/6/18.
 */
public class FinalFunction implements SampleInterface,First{
    @Override
    public void add(int x,int y){
        System.out.println("addition");
    }
    @Override
    public void display(){
        System.out.println("display");
    }
    @Override
    public void area(int r){
        System.out.println("area");
    }
//    final int x=10;
//    final void display(){
//        System.out.println("final function"); //It is not possible to override final functions
//    } //"Final classes cannot be extended",but final methods can be extended

    public static void main(String[] args) {
      FinalFunction f=new FinalFunction();
      f.area(2);
      f.add(2,4);
      f.display();

    }
}

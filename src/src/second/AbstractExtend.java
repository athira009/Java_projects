package second;

/**
 * Created by expert on 7/6/18.
 */
public class AbstractExtend extends AbstractEx {//Alt+Enter
    @Override
    public void add(int x,int y){
        int sum=x+y;
        System.out.println(sum);
    }
    @Override
    public String showMessage(String message){
        return message;
    }

    public static void main(String[] args) {
        AbstractExtend obj=new AbstractExtend();
        obj.add(2,3);
        obj.display();
        System.out.println(obj.showMessage("Hello"));
        //AbstractEX e=new AbstractEx();//Is not possible since abstract classes does nor have constructor
        AbstractEx e=new AbstractExtend();
        e.add(2,4);
        System.out.println(e.showMessage("Hii"));

    }


}

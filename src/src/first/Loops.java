package first;

/**
 * Created by expert on 6/29/18.
 */
public class Loops {
    public static void main(String[] args) {
      int count=1;
        for(int i=0;i<5;i++){
            System.out.println(i);
        }
        while(count<=0){
            System.out.println(count);
            count--;
        }
        do{
            System.out.println("count in do"+" "+count);
            count--;
        } while(count!=0);
    }
}

package second;

/**
 * Created by expert on 7/4/18.
 */
public class BankApplication {
    String name;
      int accno;
     int amount;

    public BankApplication(String name, int accno, int amount) {
        this.name = name;
        this.accno = accno;
        this.amount = amount;
    }
    public static void display(Accholder[] a){
        for (Accholder obj:a) {
            System.out.println("name :"+obj.name+" " +"Acc no :"+obj.accno+" "+"Amount :"+obj.amount);


    }

    }


}


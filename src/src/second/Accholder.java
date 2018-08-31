package second;

/**
 * Created by expert on 7/5/18.
 */
public class Accholder extends BankApplication {
int deposit;
int retrieve;

    public Accholder(String name, int accno, int amount, int deposit, int retrieve) {
        super(name, accno, amount);
        this.deposit = deposit;
        this.retrieve = retrieve;
    }
//    public static void display(Accholder[] a){
//        for (Accholder obj:a) {
//            System.out.println("name :" + name + " " + "Acc no :" + accno + " " + "Amount :" + amount);
//
//        }
//    }
   public static void displayDetails(Accholder[] a,int x){
        for (Accholder obj:a){
                if (obj.accno == x){
                    System.out.println("name :"+obj.name+" "+"Amount :"+obj.amount);
                }

            }


    }
    public static void addDeposit(Accholder[] a,int deposit,int accountno){
       for (Accholder obj:a){
           if (obj.accno==accountno){
               int n=obj.amount+deposit;

           System.out.println("the new amount is :"+n);
       }
   }}
    public static void addRetrieve(Accholder[] a,int retrieve,int accountno){
        for (Accholder obj:a){
            if (obj.accno==accountno){
                int n=obj.amount-retrieve;

                System.out.println("the new amount is :"+n);
            }
        }}
    public static void main(String[] args) {
        Accholder p1=new Accholder("AA",1,1000,2000,1500);
        Accholder p2=new Accholder("BB",2,2000,1500,1000);
        Accholder p3=new Accholder("CCC",3,3000,3000,1700);
        Accholder array[]={p1,p2,p3};

        for (Accholder obj:array) {

            System.out.println(obj.name+" "+obj.accno);



        }
       BankApplication. display(array);
        //displayDetails(array,1);
        //addDeposit(array,2000,2);
        //addRetrieve(array,1500,3);

   }}

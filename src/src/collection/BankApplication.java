package collection;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by expert on 7/10/18.
 */
public class BankApplication {
    String name;
    int accno;
    float amount,deposit,retrieve;

    public BankApplication(String name, int accno, float amount) {
        this.name = name;
        this.accno = accno;
        this.amount = amount;
        //this.deposit = deposit;
        //this.retrieve = retrieve;
    }
    public static void display(ArrayList<BankApplication> l){
        for (BankApplication obj:l) {

            System.out.println("Name and details of account holder : name - "+obj.name+" "+"Account no - "+obj.accno+" " +"Balance - "+obj.amount+" "+obj.deposit+" "+obj.retrieve);
        }

    }
    public static void displayDetails(ArrayList<BankApplication> l,int x){
        for (BankApplication obj:l) {
            if (obj.accno==x){

            System.out.println("Name and details of account holder with account no  "+x+" "+"is"+" "+obj.name+" " +obj.amount);
        } }

    }

    public static void addDeposit(ArrayList<BankApplication> l,int x,float deposit){
        for (BankApplication obj:l) {
            if (obj.accno==x){
               float n= obj.amount+deposit;
                System.out.println("Balance in"+" "+x+" "+"is"+" "+n);
            }



    }}

    public static void remove(ArrayList<BankApplication> l,int x) {
        //for (BankApplication obj:l) {
            Iterator itr=l.iterator();
            while (itr.hasNext()){
                //it.has next gives boolean values while itr.next gives object
                BankApplication n=(BankApplication) itr.next();
        if (n.accno == x) {
            l.remove(n);
            break;}
            //System.out.println(obj.name+obj.accno+" "+obj.amount);
        }
    }
    public static void main(String[] args) {
        BankApplication accholder1=new BankApplication("athira",1001,20000);
        BankApplication accholder2=new BankApplication("aswani",2005,30000);
        ArrayList<BankApplication> list=new ArrayList<>();
        list.add(accholder1);
        list.add(accholder2);
        display(list);
        displayDetails(list,2005);
        addDeposit(list,1001,20000);
        remove(list,1001);
        display(list);
        //        Iterator itr=e.iterator();
//        while (itr.hasNext()){
//            //it.has next gives boolean values while itr.next gives object
//            Employee n=(Employee) itr.next();
//            if (n.name.equals("Athira")){
//                e.remove(n);}//type casting for converting  into objects
//            System.out.println(n.name+n.salary+n.dept);
//        }

    }
}

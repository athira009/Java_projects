package second;

import first.*;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by expert on 7/11/18.
 */
public class Parking {
    int type;
    String slotnum;
    int time;
    //float amount;

    public Parking(int type, String slotnum, int time) {
        this.type = type;
        this.slotnum = slotnum;
        this.time = time;
    }
    public static void display(ArrayList<Parking> p){
        for (Parking o:p
             ) {
            System.out.println(o.slotnum);
        }
    }

    public static void displayDetails(ArrayList<Parking> p){
        for (Parking o:p
                ) {
            System.out.println(o.type+" "+o.slotnum+" "+o.time);
        }
    }

    public static void addVehicle(ArrayList<Parking> p,Parking obj){
        if (p.size()<3){
            p.add(obj);
            display(p);

        }
        else{
            System.out.println("all slots are occupied");
        }
    }

    public static void remove(ArrayList<Parking> p,String x,int amount) {
//        Iterator itr = p.iterator();
//        while (itr.hasNext()) {
//            //it.has next gives boolean values while itr.next gives object
//            Parking n = (Parking) itr.next();
//            if (n.slotnum == x) {
//                p.remove(n);
//                System.out.println(amount*n.time);
//                break;
//            }
//
//        }

        //OR
        for (Parking obj:p
             ) {
            if (obj.slotnum==x){
                p.remove(obj);
                System.out.println(amount*obj.time);
                break;
            }
        }
    }

}

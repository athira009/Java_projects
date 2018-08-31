package second;

import java.util.ArrayList;

/**
 * Created by expert on 7/11/18.
 */
public class ParkingMain {
    public static void main(String[] args) {


    Parking p1=new Parking(2,"101",2);
    Parking p2=new Parking(2,"102",4);
    Parking p3=new Parking(2,"103",6);
    Parking p4=new Parking(2,"103",5);

    ArrayList<Parking> parking=new ArrayList<>();
    Parking.addVehicle(parking,p1);
    Parking.addVehicle(parking,p2);
    Parking.addVehicle(parking,p3);
    //Parking.addVehicle(parking,p4);
        Parking.remove(parking,"101",5);
        Parking.displayDetails(parking);
}}

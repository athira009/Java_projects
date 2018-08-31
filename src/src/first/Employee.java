package first;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by expert on 7/10/18.
 */
public class Employee {
    String name,dept;
    float salary;
    public Employee(String name, float salary, String dept){
       this.name=name;
       this.salary=salary;
       this.dept=dept;
    }

// public void display(){
//     System.out.println(name+salary+dept);
// }

    public static void main(String[] args) {
        ArrayList<Employee> e=new ArrayList<>();
        Employee e1=new Employee("Athira",50000,"Big data");
        Employee e2=new Employee("BB",45000,"Big data");
        e.add(e1);
        e.add(e2);
        for (Employee obj:e) {

            System.out.println(obj.name+" "+obj.salary+" " +obj.dept);
        }
        Iterator itr=e.iterator();
        while (itr.hasNext()){
            //it.has next gives boolean values while itr.next gives object
            Employee n=(Employee) itr.next();
            if (n.name.equals("Athira")){
            e.remove(n);}//type casting for converting  into objects
            System.out.println(n.name+n.salary+n.dept);
        }
    }


}

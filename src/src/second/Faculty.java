package second;

/**
 * Created by expert on 7/4/18.
 */
public class Faculty extends department {
int facid;
String name;

    public Faculty(int deptid, String deptname, int facid, String name) {
        super(deptid, deptname);
        this.facid = facid;
        this.name = name;
    }

    public void printDetails(){
        System.out.println("Dept id : "+super.deptid+" "+super.deptname+" "+facid+" "+name);
    }

    public static void main(String[] args) {
        Faculty f=new Faculty(1,"Mathematics",1,"A");
       f.printDetails();
    }
  }



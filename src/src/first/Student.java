package first;

/**
 * Created by expert on 6/27/18.
 */
public class Student {
    int rollno;
    String name;
    Student(int no, String names) {
        rollno = no;
        name = names;
    }
        void display(){
        System.out.println("rollnumber:"+rollno+" "+"name:"+name);
    }

    public static void main(String[] args) {


        Student s = new Student(3, "Athira");
        s.display();
    }

}

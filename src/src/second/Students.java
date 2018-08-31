package second;

import first.Student;

/**
 * Created by expert on 7/3/18.
 */
public class Students {
    int id;
    String name;
    public Students(int id, String name) {
        this.id = id;
        this.name=name;
    }

    public static void main(String[] args) {
        Students s=new Students(1,"athira");
        Students s1=new Students(2,"anu");
        String ss[]={"abc","def"};
        Students array[]={s,s1};
        for (Students obj:array)
        {
            System.out.println(obj.id+" "+obj.name);
        }

    }
}

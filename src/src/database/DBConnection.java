package database;

import java.sql.*;

/**
 * Created by expert on 7/30/18.
 */
public class DBConnection {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
//        Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb"
//                ,"root","root");
//        Statement statement=connection.createStatement();
//        statement.executeUpdate("insert into student values(1,'athira')");
//        statement.executeUpdate("update employee set employeename='afc' where idemployee=3");
//        ResultSet rs=statement.executeQuery("select * from student");
//        while(rs.next()){
//            System.out.println(rs.getInt(1)+" "+rs.getString("name"));
//            //getInt for printing integer values
//            //getString for printing string
//            //columnIndex is column no
//            //columnLabel is name of column
//
//
//
//        }
//        //statement.executeUpdate("delete from student where id =1");
//        //statement.executeUpdate("update student set name='athira' where id=2");
//        statement.executeUpdate("update student set id=1 where name='athira'");
//        PreparedStatement ps=connection.prepareStatement("insert into student values(?,?)");
//        //ps.setInt(2,12);
//        ps.setInt(1,12);
//        ps.setString(2,"asdd");
//        //ps.setInt(3,22);
//        ps.setString(4,"asce");
//        ps.executeUpdate();
//        //ps.setInt(3,12);
        Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee"
               ,"root","root");
        Statement statement=connection.createStatement();

//        CallableStatement cs=connection.prepareCall("{call getDepartment(?,?)}");//calling a sql procedure
//        cs.setInt(1,12);
//        cs.setString(2,"athira");
//        cs.execute();
//        ResultSet rs1=cs.getResultSet();
//        while(rs1.next()){
//            System.out.println(rs1.getInt("idEmployee")+" "+
//                    rs1.getString("Employeename")+" "+rs1.getInt("salary")+
//                    " "+rs1.getInt("deptid"));
//        }

        CallableStatement cs=connection.prepareCall("{call total_procedure(?,?,?)}");
        cs.setInt(1,12);
       cs.setString(2,"athira");
       cs.registerOutParameter(3,Types.INTEGER);//type of 3rd parameter is integer
       cs.execute();
       int x=cs.getInt(3);
       //or
        int y=cs.getInt("total");
        System.out.println(x);
        //or
        System.out.println(y);

        connection.close();
    }
}

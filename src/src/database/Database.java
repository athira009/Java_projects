package database;

import java.sql.*;

/**
 * Created by expert on 8/3/18.
 */
public class Database {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/company"
                ,"root","root");
        Statement statement=connection.createStatement();
        //statement.executeUpdate("update product set name='afc',price='15',quantity='1' where idproduct=3");
//        CallableStatement cs=connection.prepareCall("{call new_procedure_max}");
//        cs.execute();
//        ResultSet rs=cs.getResultSet();
//        while(rs.next()){
//            System.out.println(rs.getInt(1));
//
//        }

//        CallableStatement cs=connection.prepareCall("{call new_procedure(?,?)}");
//        cs.setInt(1,15000);
//        cs.setString(2,"m");
//        cs.execute();
//        ResultSet rs=cs.getResultSet();
//        while(rs.next()){
//            System.out.println(rs.getInt("id")+" "+rs.getString("name")+" "+rs.getString("gender")+" "+rs.getInt("salary"));
//
//        }
//list product details in the ascending order of produuct name
       ResultSet rs=statement.executeQuery("select * from product order by name");
        while(rs.next()){
          System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
       }



//Find average of salry from Employee

//       ResultSet rs= statement.executeQuery("select avg(salary) from Employee");
//        while(rs.next()){
//           System.out.println(rs.getInt(1));
//        }








        connection.close();

    }
}

package database;

import java.sql.*;

/**
 * Created by expert on 7/31/18.
 */
public class DBExample {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb"
                ,"root","root");
        Statement statement=connection.createStatement();

        statement.executeUpdate("insert into student values(3,'aswani')");

        PreparedStatement ps=connection.prepareStatement("select * from student where id =?");
        ps.setInt(1,3);
        ResultSet rs=ps.executeQuery();
        if(rs.next()){
            System.out.println(rs.getString(1)+" "+rs.getString(2));
        }


    }
}

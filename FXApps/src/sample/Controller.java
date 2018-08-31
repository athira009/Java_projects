package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import java.awt.*;
import java.sql.*;
public class Controller {
    @FXML
    TextField text1;
    @FXML
    public void buttonEvent(ActionEvent obj) throws ClassNotFoundException,SQLException{
        //System.out.println(text1.getText());
        //System.out.println("button clicked");
        Class.forName("com.mysql.jdbc.Driver");

        Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb"
                ,"root","root");
        Statement statement=connection.createStatement();

        statement.executeUpdate("insert into student values(4,'"+text1.getText()+"')");
        connection.close();
    }


}

package AWT;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * Created by expert on 7/25/18.
 */
public class Sample1 implements ActionListener{
    private JButton button,button1;
    JTextField textField;
    JTextField textField1;
    JTextField textField2;
    JLabel label;
    Sample1(){
        JFrame frame=new JFrame("Second App");

        button=new JButton("Add");
        button1=new JButton("Subtract");

        frame.setLayout(null);
        frame.setSize(500,500);
        //frame.setVisible(true);
        frame.add(button);
        button.setBounds(150,200,70,70);
        frame.add(button1);
        button1.setBounds(240,200,70,70);
        button.addActionListener(this);
        button1.addActionListener(this);
         textField=new JTextField();
        textField1=new JTextField();
        textField2=new JTextField();
        frame.add(textField);
        frame.add(textField1);
        frame.add(textField2);
        textField.setBounds(200,50,90,40);
        textField1.setBounds(200,100,90,40);
        textField2.setBounds(200,150,90,40);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Sample1();
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource()==button)
//            Integer.parseInt(textField.getText());
//           Integer.parseInt(textField1.getText());
         textField2.setText(Integer.toString(Integer.parseInt(textField.getText())+Integer.parseInt(textField1.getText())));
        if (e.getSource()==button1)
//            Integer.parseInt(textField.getText());
//           Integer.parseInt(textField1.getText());
        textField2.setText(Integer.toString(Integer.parseInt(textField.getText())-Integer.parseInt(textField1.getText())));

    }
}

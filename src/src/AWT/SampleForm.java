package AWT;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by expert on 7/25/18.
 */
public class SampleForm implements ActionListener {
    private JButton button1;
    private JPanel panel1;
    JTextField textField;
    JLabel label;
    SampleForm(){
        //Simple window
//        JFrame frame=new JFrame("First App");
//        button1=new JButton("click");
//
//        frame.setLayout(null);
//        frame.setSize(500,500);
//        //frame.setVisible(true);
//        frame.add(button1);
//        button1.setBounds(120,100,70,70);
//        frame.setVisible(true);
        JFrame frame=new JFrame("First App");
        button1=new JButton("click");
        textField=new JTextField();
        label=new JLabel("First name");
        frame.setLayout(null);
        frame.setSize(500,500);
        //frame.setVisible(true);
        frame.add(button1);
        frame.add(label);
        frame.add(textField);
        label.setBounds(200,50,90,50);
        textField.setBounds(200,100,90,40);
        button1.setBounds(100,100,70,70);
        button1.addActionListener(this);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new SampleForm();
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource()==button1)
        textField.setText("Welcome!");//for displaying in text field
        JOptionPane.showMessageDialog(null,"warning");
    }
}

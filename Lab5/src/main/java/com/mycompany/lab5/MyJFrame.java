/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab5;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
/**
 *
 * @author hassan
 */
public class MyJFrame extends JFrame{
    JButton decrease = new  JButton("-");
    JButton increase = new  JButton("+");
    JButton Reset = new  JButton("Reset");
    JLabel label = new JLabel("Increment/Decrement");
    JTextField Text = new JTextField(15);
    EventHandler handler = new EventHandler();
    int counter ;
    public MyJFrame (){
        super("Counter App");
        setLayout(new GridLayout());
        add(label , BorderLayout.PAGE_START);
        add(decrease , BorderLayout.WEST);
        add(Text,BorderLayout.CENTER );
        add(increase , BorderLayout.EAST);
        add(Reset , BorderLayout.SOUTH); 
        increase.addActionListener(handler);
        decrease.addActionListener(handler);
        Reset.addActionListener(handler);
    }
    private class EventHandler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == increase) 
            {    
               ++counter;
               Text.setText(""+counter);
            }
            else if (e.getSource() == decrease) 
            {
                --counter;
                Text.setText(""+counter);
            }
            else {
                counter = 0;
                Text.setText(""+counter);
            }
            }
    
    }
}

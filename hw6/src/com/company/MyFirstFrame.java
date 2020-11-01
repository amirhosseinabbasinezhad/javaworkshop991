package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class MyFirstFrame extends JFrame{
    public String value1,value2;
    public MyFirstFrame (){
        this("");
    }
    public MyFirstFrame( String LOGIN){
        super(LOGIN);
        this.setSize(500,400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel lbl1=new JLabel("USERNAME:");
        final JTextField tf1,pf2;
        tf1=new JTextField(10);
        JLabel lbl2=new JLabel("PASSWORD:");
        pf2=new JPasswordField(10);
        JButton b1=new JButton("LOGIN");
        this.add(lbl1);
        lbl1.setBounds(100,50,100,100);
        this.add(tf1);
        tf1.setBounds(180,94,150,18);
        this.add(lbl2);
        lbl2.setBounds(100,80,100,100);
        pf2.setBounds(180,124,150,18);
        this.add(pf2);
        this.add(b1);
        b1.setBounds(200,200,95,30);
        class ListenToClick implements ActionListener
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                 value1=tf1.getText();
                 value2=pf2.getText();
                Persons p1 = new Persons();
                Persons p2 =new Persons();
                Persons p3 = new Persons();
                p1.setName("ali");
                p1.setFamily("mohammadi");
                p1.setPassword("A12345");
                p1.setUsername("ali7979");
                p1.setTicketnumber(null);
                p2.setName("alireza");
                p2.setFamily("alavi");
                p2.setPassword("m21226");
                p2.setUsername("alireza2642");
                p2.setTicketnumber(null);
                p3.setName("omid");
                p3.setFamily("karimi");
                p3.setPassword("omidii2");
                p3.setUsername("omidk717");
                p3.setTicketnumber(null);
                List<Persons> data = new ArrayList<Persons>();
                data.add(p1);
                data.add(p2);
                data.add(p3);
                    if ((value1.equals(p1.getUsername()) && (value2.equals(p1.getPassword())))||(value1.equals(p2.getUsername()) && (value2.equals(p2.getPassword()))||(value1.equals(p3.getUsername()) && (value2.equals(p3.getPassword())))) ){
                        NextPage n1=new NextPage();

                    }
                    else{
                        JOptionPane.showMessageDialog(null,"incorrect username or password","Eror",JOptionPane.ERROR_MESSAGE);
                    }}
            }

        b1.addActionListener(new ListenToClick());

        this.setLayout(null);
        this.setVisible(true);
    }



}

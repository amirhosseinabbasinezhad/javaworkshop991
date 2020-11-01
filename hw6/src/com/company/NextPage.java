package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NextPage extends JFrame {

    public NextPage() {
        this("");
    }

    public NextPage(String CarsInfo) {
        super(CarsInfo);
        this.setSize(500,400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel truck =new JLabel("truck");
        truck.setBounds(30,10,50,60);
        this.add(truck);
        JLabel taxi =new JLabel("taxi");
        taxi.setBounds(30,70,50,60);
        this.add(taxi);
        JLabel bus = new JLabel("        bus");
        bus.setBounds(60,110,50,60);
        JButton b1=new JButton("info");
        b1.setBounds(200,30,75,20);
        this.add(b1);
        JButton b2=new JButton("info");
        b2.setBounds(200,100,75,20);
        this.add(b2);
        JButton b3=new JButton("info");
        b3.setBounds(200,170,75,20);
        this.add(b3);
        JButton b4 = new JButton("<-back");
        b4.setBounds(10,10,75,20);

        class ListenToClick implements ActionListener
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource()==b4){
                    MyFirstFrame m1 =new MyFirstFrame();
                }
                else if (e.getSource()==b3){
                    Bus bus1=new Bus();
                }
                else if (e.getSource()==b2){
                    Taxi taxsi1=new Taxi();
                }
                else if (e.getSource()==b1){
                    Truck Tr1 =new Truck();
                }
            }
            }
        b1.addActionListener(new ListenToClick());
        b2.addActionListener(new ListenToClick());
        b3.addActionListener(new ListenToClick());
        b4.addActionListener(new ListenToClick());
        this.add(b4);
        this.add(bus);
        this.setVisible(true);

    }
}
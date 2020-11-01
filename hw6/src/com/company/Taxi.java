package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Taxi extends JFrame {
    public String ticket;
    public Taxi() {
        this("");
    }

    public Taxi(String TravelInfo) {
        super(TravelInfo);
        this.setSize(500,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        String data[][]={{"200","تهران","مشهد"},{"201","یاسوج","بندرعباس"},{"202","شیراز","مازندران"},{"203","اردبیل","ساوه"},{"204","ساوه","قم"},{"206","صادقیه","میدان آزاذی"}};
        String columm[]={"ID","مبدا","مقصد"};
        JTable tablebus =new JTable(data,columm);


        tablebus.setBounds(30,40,200,300);
        JScrollPane sp=new JScrollPane(tablebus);

        String cmbdata[]={"200","201","202","203","204","206"};
        JComboBox cmb=new JComboBox(cmbdata);
        cmb.setBounds(50,400,90,20);
        this.add(cmb);
        JButton buy =new JButton("buy ticket");
        buy.setBounds(300,400,90,35);
        this.add(buy);

        cmb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ticket= (String) cmb.getItemAt(cmb.getSelectedIndex());
            }
        });
        class ListenToClick implements ActionListener
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource()==buy){
                    JOptionPane.showMessageDialog(null,"you buy ticket number "+ ticket ,"sucsses",JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }
        buy.addActionListener(new ListenToClick());
        this.add(sp);
        this.setVisible(true);
    }
}



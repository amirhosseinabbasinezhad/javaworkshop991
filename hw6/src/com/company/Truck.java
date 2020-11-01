package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Truck extends JFrame {
    public String ticket;
    public Truck() {
        this("");
    }

    public Truck(String TravelInfo) {
        super(TravelInfo);
        this.setSize(500,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        String data[][]={{"300","تهران","مشهد"},{"301","یاسوج","بندرعباس"},{"302","شیراز","مازندران"},{"303","اردبیل","ساوه"},{"305","دماوند","ساوه"},{"304","ساوه","قم"},{"306","صادقیه","میدان آزاذی"}};
        String columm[]={"ID","مبدا","مقصد"};
        JTable tablebus =new JTable(data,columm);


        tablebus.setBounds(30,40,200,300);
        JScrollPane sp=new JScrollPane(tablebus);

        String cmbdata[]={"300","301","302","303","304","305","306"};
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


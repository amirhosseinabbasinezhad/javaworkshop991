package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        SaveInfo s1=new SaveInfo();
        String[] info=new String[7];
        System.out.println("please enter your name");
        info[1]=input.nextLine();
        System.out.println("please enter your family");
        info[2]=input.nextLine();
        System.out.println("please enter your meli code");
        info[3]=input.nextLine();
        System.out.println("please enter city that you live");
        info[4]=input.nextLine();
        System.out.println("please enter name of your car ");
        info[5]=input.nextLine();
        System.out.println("please enter color of your car");
        info[6]=input.nextLine();
        s1.setName(info[1]);
        s1.setFamily(info[2]);
        s1.setMellicode(info[3]);
        s1.setCity(info[4]);
        s1.setCarname(info[5]);
        s1.setCarcolor(info[6]);
        System.out.println();
        System.out.println("for show saved info enter (1)");
        int i=input.nextInt();
        if (i==1){
            System.out.println("name is :"+s1.getName());
            System.out.println("family is :"+s1.getFamily());
            System.out.println("mellicode is :"+s1.getMellicode());
            System.out.println("city is :"+s1.getCity());
            System.out.println("car is :"+s1.getCarname());
            System.out.println("color is :"+s1.getCarcolor());
        }
        else{
            System.out.println("no thing be for show");
        }
    }

}

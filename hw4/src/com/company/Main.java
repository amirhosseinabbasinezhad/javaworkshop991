package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String name,num;
        SimCard sim1=new SimCard();
        SimCard sim2=new SimCard();
        SimCard sim3=new SimCard();
        SimCard sim4=new SimCard();
        SimCard sim5=new SimCard();
        SimCard mysim=new SimCard();
        System.out.println("for test with my card enter (1) and for add 5 cards enter (2)");
        if (input.nextInt()==2){
        System.out.println("please enter name");
        sim1.setName(input.next());
        System.out.println("please enter number example(09338227022)");
        sim1.setNumber(input.next());
        System.out.println("please enter kind of sim (daemi/etebari");
        sim1.setKindsim(input.next());
        System.out.println("please enter operator (irancell/hamrahavval)");
        sim1.setOperator(input.next());
        System.out.println("please enter genrate (3G/4G)");
        sim1.setGeneratesim(input.next());
        sim1.setGeneratesim(0);
        System.out.println("please enter name");
        sim2.setName(input.nextLine());
        System.out.println("please enter number example(09338227022)");
        sim2.setNumber(input.next());
        System.out.println("please enter kind of sim (daemi/etebari");
        sim2.setKindsim(input.next());
        System.out.println("please enter operator (irancell/hamrahavval)");
        sim2.setOperator(input.next());
        System.out.println("please enter genrate (3G/4G)");
        sim2.setGeneratesim(input.next());
        sim2.setGeneratesim(0);

        System.out.println("please enter name");
        sim3.setName(input.nextLine());
        System.out.println("please enter number example(09338227022)");
        sim3.setNumber(input.next());
        System.out.println("please enter kind of sim (daemi/etebari");
        sim3.setKindsim(input.next());
        System.out.println("please enter operator (irancell/hamrahavval)");
        sim3.setOperator(input.next());
        System.out.println("please enter genrate (3G/4G)");
        sim3.setGeneratesim(input.next());
        sim3.setGeneratesim(0);

        System.out.println("please enter name");
        sim4.setName(input.nextLine());
        System.out.println("please enter number example(09338227022)");
        sim4.setNumber(input.next());
        System.out.println("please enter kind of sim (daemi/etebari");
        sim4.setKindsim(input.next());
        System.out.println("please enter operator (irancell/hamrahavval)");
        sim4.setOperator(input.next());
        System.out.println("please enter genrate (3G/4G)");
        sim4.setGeneratesim(input.next());
        sim4.setGeneratesim(0);

        System.out.println("please enter name");
        sim5.setName(input.next());
        System.out.println("please enter number example(09338227022)");
        sim5.setNumber(input.next());
        System.out.println("please enter kind of sim (daemi/etebari");
        sim5.setKindsim(input.next());
        System.out.println("please enter operator (irancell/hamrahavval)");
        sim5.setOperator(input.next());
        sim5.setGeneratesim(0);
            System.out.println("please enter genrate (3G/4G)");
            sim5.setGeneratesim(input.next());
        List<SimCard> data=new ArrayList<SimCard>();
        data.add(sim1);
        data.add(sim2);
        data.add(sim3);
        data.add(sim4);
        data.add(sim5);
        System.out.println("for log in enter 1");
        if (input.nextInt()==1) {
            System.out.println("please enter number");
            num=input.next();
            System.out.println("please enter name");
            name=input.next();
            for(SimCard i:data) {
                if (num.equals(i.getNumber())&& name.equals(i.getName())) {
                    System.out.println("log in successfully...");
                    System.out.println("your simcards info ---");
                    System.out.println("name:"+i.getName());
                    System.out.println("number:"+i.getNumber());
                    System.out.println(i.getGeneratesim());
                    System.out.println(i.getOperator());
                    System.out.println(i.getKindsim());
                    System.out.println("for recharj enter 3");
                    if (input.nextInt()==3){
                        System.out.println("che meghdar sharj shavad");
                        SimCard.resharje(input.nextInt());
                    }

                }
            }
        }
        }
        else{
            System.out.println("enter number(09121234567) & name(amir)");
            num=input.next();
            name=input.next();
            mysim.setName("amir");
            mysim.setNumber("09121234567");
            mysim.setKindsim("daemi");
            mysim.setOperator("hamrahavval");
            mysim.setGeneratesim("4G");
            mysim.setSharje(0);
            if (num.equals(mysim.getNumber())&&name.equals(mysim.getName())){
                System.out.println("log in successfully...");
                System.out.println("your simcards info ---");
                System.out.println("name:"+mysim.getName());
                System.out.println("number:"+mysim.getNumber());
                System.out.println(mysim.getGeneratesim());
                System.out.println(mysim.getOperator());
                System.out.println(mysim.getKindsim());
            }
            System.out.println("for recharj enter 3");
            if (input.nextInt()==3){
                System.out.println("che meghdar sharj shavad");
                SimCard.resharje(input.nextInt());
            }

        }

    }
}

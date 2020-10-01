package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i,a,max=0;
        for (i=1;i<=3;i++){
            System.out.printf("please enter %d th number:",i);
            a=input.nextInt();
            if(a>max){
                max=a;
            }
        }
        System.out.print("maximum is ...");
        System.out.println(max);
    }
}

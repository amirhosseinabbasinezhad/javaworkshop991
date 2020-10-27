package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Employee e1=new Employee();
        Employee e2=new Employee();
        Employee e3=new Employee();
        Employee e4=new Employee();
        Employee e5=new Employee();
        Employee e6=new Employee();
        Employee e7=new Employee();
        Employee e8=new Employee();
        Employee e9=new Employee();
        Employee e10=new Employee();
        e1.setName("amir alavi");
        e1.setFathername("reza");
        e1.setEdu("lisans");
        e1.setNational("IRAN");
        e1.setSalary("3000000");
        e2.setName("reza ahadpoor");
        e2.setFathername("ali");
        e2.setEdu("lisans");
        e2.setNational("IRAN");
        e2.setSalary("3500000");
        e3.setName("mahdi karimi");
        e3.setFathername("mohammad");
        e3.setEdu("diploma");
        e3.setNational("IRAN");
        e3.setSalary("2500000");
        e4.setName("masud imany");
        e4.setFathername("hassan");
        e4.setEdu("lisans");
        e4.setNational("IRAN");
        e4.setSalary("3200000");
        e5.setName("alireza davari");
        e5.setFathername("sadegh");
        e5.setEdu("fogh lisans");
        e5.setNational("IRAN");
        e5.setSalary("4500000");
        e6.setName("amir reza memar");
        e6.setFathername("mahmud");
        e6.setEdu("lisans");
        e6.setNational("IRAN");
        e6.setSalary("3300000");
        e7.setName("hamed abbasi");
        e7.setFathername("hamid");
        e7.setEdu("lisans");
        e7.setNational("IRAN");
        e7.setSalary("4000000");
        e8.setName("mahdi pahlevanian");
        e8.setFathername("matin");
        e8.setEdu("lisans");
        e8.setNational("IRAN");
        e8.setSalary("2900000");
        e9.setName("amir hossein jedi");
        e9.setFathername("milad");
        e9.setEdu("lisans");
        e9.setNational("IRAN");
        e9.setSalary("3000000");
        e10.setName("mostafa nemati");
        e10.setFathername("morteza");
        e10.setEdu(" fogh lisans");
        e10.setNational("IRAN");
        e10.setSalary("4200000");
        String strname ,strfather;
        System.out.println("for login enter name and fathername");
        strname=input.next();
        strfather=input.next();
        System.out.println("for show info enter (1)");
        if (input.nextInt()==1){

        }

    }
}

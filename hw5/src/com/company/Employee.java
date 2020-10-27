package com.company;

import java.util.Map;

public class Employee <NAME,EDU,FATHERNAME,NATIONAL,SALARY>{
    private NAME name;
    private EDU edu;
    private FATHERNAME fathername;
    private NATIONAL national;
    private SALARY salary;

    public FATHERNAME getFathername() {
        return fathername;
    }

    public void setFathername(FATHERNAME fathername) {
        this.fathername = fathername;
    }

    public NATIONAL getNational() {
        return national;
    }

    public void setNational(NATIONAL national) {
        this.national = national;
    }

    public SALARY getSalary() {
        return salary;
    }

    public void setSalary(SALARY salary) {
        this.salary = salary;
    }

    public NAME getName() {
        return name;
    }

    public void setName(NAME name) {
        this.name = name;
    }

    public EDU getEdu() {
        return edu;
    }

    public void setEdu(EDU edu) {
        this.edu = edu;
    }
    public void Showinfo(){

    }
    public void Showsalary(){

    }
    public void Showworkstime(){

    }
}

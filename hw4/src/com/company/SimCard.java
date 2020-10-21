package com.company;

public class SimCard <KINDSIM , OPERATOR ,GENERATESIM , NUMBER , NAME , SHARJE>{
    private KINDSIM kindsim;
    private OPERATOR operator;
    private GENERATESIM generatesim;
    private NUMBER number;
    private NAME name;
    private SHARJE sharje;

    public SHARJE getSharje() {
        return sharje;
    }

    public void setSharje(SHARJE sharje) {
        this.sharje = sharje;
    }

    public KINDSIM getKindsim() {
        return kindsim;
    }

    public void setKindsim(KINDSIM kindsim) {
        this.kindsim = kindsim;
    }

    public OPERATOR getOperator() {
        return operator;
    }

    public void setOperator(OPERATOR operator) {
        this.operator = operator;
    }

    public GENERATESIM getGeneratesim() {
        return generatesim;
    }

    public void setGeneratesim(GENERATESIM generatesim) {
        this.generatesim = generatesim;
    }

    public NUMBER getNumber() {
        return number;
    }

    public void setNumber(NUMBER number) {
        this.number = number;
    }

    public NAME getName() {
        return name;
    }

    public void setName(NAME name) {
        this.name = name;
    }
    public static void resharje(int x ){
        int s=0 ;
        s=x+s;
        System.out.println("resharje successfully etebar="+s);
    }
}

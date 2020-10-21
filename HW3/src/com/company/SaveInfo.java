package com.company;

public class SaveInfo {
    private String name;
    private String family;
    private String mellicode;
    private String city;
    private String carname;
    private String carcolor;

    public void setName(String name) {
        this.name = name;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public void setMellicode(String mellicode) {
        this.mellicode = mellicode;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCarname(String carname) {
        this.carname = carname;
    }

    public void setCarcolor(String carcolor) {
        this.carcolor = carcolor;
    }

    public String getName() {
        return name;
    }

    public String getFamily() {
        return family;
    }

    public String getMellicode() {
        return mellicode;
    }

    public String getCity() {
        return city;
    }

    public String getCarname() {
        return carname;
    }

    public String getCarcolor() {
        return carcolor;
    }
    public static void Printinfo(String name,String family,String mellicode,String city,String carcolor,String carname){
        System.out.println(name+family+mellicode+city+carcolor+carname);
    }
}

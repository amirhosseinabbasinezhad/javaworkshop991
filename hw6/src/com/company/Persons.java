package com.company;

public class Persons <NAME,FAMILY,USERNAME,PASSWORD,TICKETNUMBER>{
    private NAME name;
    private FAMILY family;
    private USERNAME username;
    private PASSWORD password;
    private TICKETNUMBER ticketnumber;

    public NAME getName() {
        return name;
    }

    public void setName(NAME name) {
        this.name = name;
    }

    public FAMILY getFamily() {
        return family;
    }

    public void setFamily(FAMILY family) {
        this.family = family;
    }

    public USERNAME getUsername() {
        return username;
    }

    public void setUsername(USERNAME username) {
        this.username = username;
    }

    public PASSWORD getPassword() {
        return password;
    }

    public void setPassword(PASSWORD password) {
        this.password = password;
    }

    public TICKETNUMBER getTicketnumber() {
        return ticketnumber;
    }

    public void setTicketnumber(TICKETNUMBER ticketnumber) {
        this.ticketnumber = ticketnumber;
    }
}

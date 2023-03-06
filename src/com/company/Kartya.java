package com.company;

public class Kartya {

    private String szin;
    private String figura;
    private int ertek;


    public Kartya() {
    }

    public Kartya(String szin, String figura, int ertek) {
        this.setSzin(szin);
        this.setFigura(figura);
        this.setErtek(ertek);
    }

    @Override
    public String toString() {
       return ( getSzin() +" "+ getFigura() +" " +"("+ getErtek()+")"
        );
    }

    public String getSzin() {
        return szin;
    }

    public void setSzin(String szin) {
        this.szin = szin;
    }

    public String getFigura() {
        return figura;
    }

    public void setFigura(String figura) {
        this.figura = figura;
    }

    public int getErtek() {
        return ertek;
    }

    public void setErtek(int ertek) {
        this.ertek = ertek;
    }
}

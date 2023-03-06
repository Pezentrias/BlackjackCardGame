package com.company;

import java.util.ArrayList;
import java.util.List;

public abstract class Jatekos {

    protected List<Kartya> kez;
    private String nev;
    private int zseton;

    public Jatekos() {
    }

    public Jatekos(List<Kartya> kez, String nev, int zseton) {
        this.kez = kez;
        this.nev = nev;
        this.zseton = zseton;
    }

    public Jatekos(String nev, int zseton) {
        this.nev = nev;
        this.zseton = zseton;
        kez = new ArrayList<>();
    }

    public void kezKiir(Jatekos Jani) {
        for (Kartya kartya : kez) {
            System.out.print(kartya + ", ");
            System.out.println();
            System.out.println(" Lapok összértéke: " + getKezErtek());

        }
    }
    public abstract boolean KerELapot();


    public int getKezErtek() {
        int kezErteke = 0;
        for (Kartya kartya : kez) {
            kezErteke += kartya.getErtek();

        }
        return kezErteke;
    }
    public abstract void kezKiir();

    public void lapotKap(Kartya lap) {
        kez.add(lap);
    }

    public List<Kartya> getKez() {
        return kez;
    }

    public void setKez(List<Kartya> kez) {
        this.kez = kez;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public int getZseton() {
        return zseton;
    }

    public void setZseton(int zseton) {
        this.zseton = zseton;
    }


}

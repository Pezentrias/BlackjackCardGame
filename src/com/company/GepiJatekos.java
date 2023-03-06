package com.company;

public class GepiJatekos extends Jatekos {

    public GepiJatekos(String nev, int zseton) {
        super(nev, zseton);
    }


    @Override
    public boolean KerELapot() {
        return getKezErtek() < 16;
    }

    @Override
    public void kezKiir() {
        System.out.println(getNev()+" lapjainak összértéke: "+getKezErtek());
        for (Kartya kartya : kez) {
            System.out.print(kartya+", ");
        }


    }
}

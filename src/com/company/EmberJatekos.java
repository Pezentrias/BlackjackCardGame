package com.company;

import java.util.Locale;
import java.util.Scanner;

public class EmberJatekos extends Jatekos {

    public EmberJatekos(String nev, int zseton) {
        super(nev, zseton);
    }

    @Override
    public boolean KerELapot() {
        if (getKezErtek() < 20) {
            Scanner sca = new Scanner(System.in);
            System.out.println("Kérsz még lapot öreg?  (I/N)");
            String valasz = sca.nextLine();
            return valasz.equalsIgnoreCase("I");

        }
        return false;

    }


    @Override
    public void kezKiir() {
        System.out.println(getNev()+" lapjainak összértéke: "+getKezErtek());

        for (Kartya kartya : kez) {
            System.out.print(kartya+",  ");
        }
        System.out.println();
    }


}

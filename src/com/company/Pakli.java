package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pakli {

    public static String[] szinek = {"tök", "makk", "piros", "zöld"};
    public static String[] figurak = {"hetes", "nyolcas", "kilences", "tizes", "alsó", "felső", "király", "ász"};
    public static int[] ertekek = {7, 8, 9, 10, 2, 3, 4, 11};

    private List<Kartya> lapok;

    public Pakli() {
        lapok = new ArrayList<>();
    /* for (int i = 0; i <8; i++) {pakli.add(new Kartya(szinek[0],figurak[i],ertekek[i] )); }
        for (int i = 0; i <8; i++) {pakli.add(new Kartya(szinek[1],figurak[i],ertekek[i] )); }
        for (int i = 0; i <8; i++) {pakli.add(new Kartya(szinek[2],figurak[i],ertekek[i] )); }
        for (int i = 0; i <8; i++) {pakli.add(new Kartya(szinek[3],figurak[i],ertekek[i] )); }*///ez ugyanaz mint az alsó csak nem elegáns
        for (int i = 0; i < szinek.length; i++) {
            for (int i1 = 0; i1 < figurak.length; i1++) {
                lapok.add(new Kartya(szinek[i], figurak[i1], ertekek[i1]));
            }
        }
    }

    public void kiir() {
        for (Kartya kartya : lapok) {
            System.out.println(szinek + ", " + figurak + ", " + ertekek);

        }
    }

    public void kever() {
        Collections.shuffle(lapok);
    }

    public Kartya oszt() {
        Kartya k = lapok.get(0);
        lapok.remove(0);
        return k;
    }


}

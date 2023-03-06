package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Jatekos> jatekosok = new ArrayList<>();
       EmberJatekos jatekos1 = new EmberJatekos("Noel", 100);
        jatekosok.add(jatekos1);
        GepiJatekos oszto = new GepiJatekos("Osztó", 100);
        jatekosok.add(oszto);
        Pakli pakli = new Pakli();
        pakli.kever();

        for (int i = 0; i < 2; i++) {
            for (Jatekos jatekos : jatekosok) {  // minden játékos kap 2 db lapot, 2 x 1 lapot
                jatekos.lapotKap(pakli.oszt());
            } }

        for (Jatekos jatekos : jatekosok) {
            if (jatekos instanceof  EmberJatekos){
                jatekos.kezKiir();
            }

         while (jatekos.KerELapot()){
             jatekos.lapotKap(pakli.oszt());
             if (jatekos instanceof EmberJatekos){
                 jatekos.kezKiir();
             } } }

        System.out.println();
        System.out.println("Eredmény: ");
        System.out.println();

        for (Jatekos jatekos : jatekosok) {

            jatekos.kezKiir();
            System.out.println();}
        System.out.println();


        if (jatekos1.getKezErtek()==21){
            System.out.println("Blackjack! Nyert a " +jatekos1.getNev()+ "! Kiváló!");
        }else if (oszto.getKezErtek()==21){
            System.out.println("Blackjack! Nyert a Bank! Basszus!");
        }
        else if (oszto.getKezErtek()==21&&jatekos1.getKezErtek()==21){
            System.out.println("Mindenkinek Blackjack! Senki nem nyert basszus!");
        }
        else  if (jatekos1.getKezErtek()>21&& oszto.getKezErtek()>21){
            System.out.println("Mindenki veszít!");
        }
        else if (jatekos1.getKezErtek()>21){
            System.out.println("Játékos túllépte a 21-et! Nyert a Bank!");
        }
        else  if (oszto.getKezErtek()>21){
            System.out.println("Bank túllépte a 21-et, " +jatekos1.getNev()+ " nyert!");
        }
        else if (jatekos1.getKezErtek()> oszto.getKezErtek()){
            System.out.println("Gratulálok! " +jatekos1.getNev()+ " n" + " nyert!");
        }
        else if (jatekos1.getKezErtek()== oszto.getKezErtek()){
            System.out.println("Döntetlen! Ez igen!");
        }

        else {
            System.out.println("Nyert a Bank! Szopacs!");
        }
        }

        }



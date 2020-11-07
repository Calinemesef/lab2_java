package edu.ubb;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){

        List<Sport> sport = new ArrayList<Sport>();

        Basketball b1 = new Basketball();
        Fussball f1 = new Fussball();

        sport.add(b1);
        sport.add(f1);

        Benutzer benutzer = new Benutzer("Mozacu", "Bogdan",sport);

        Mannschaftssport mannschaft = new Mannschaftssport();
        Leichtathletik leichtat = new Leichtathletik();

        System.out.println("Der Benutzer " + benutzer.getName() + " "+ benutzer.getVorname() + " braucht fur seine Lieblingssoprte " + benutzer.kalkuliereZeit() + " Minuten.\n");
        System.out.println("Sein Durchschittszeit ist " + benutzer.kalkuliereDurchschnittszeit() + " Minuten.\n");
        System.out.println("Sein Zeit fur den Leichtathletiksportarten ist " + benutzer.kalkuliereZeit(leichtat) + " Minuten.");





    }


}

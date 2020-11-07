package edu.ubb;

import java.util.List;

public class Benutzer {

    private String Name;
    private String Vorname;
    private List<Sport> sport;

    public Benutzer(String name, String vorname, List<Sport> sport) {
        Name = name;
        Vorname = vorname;
        this.sport = sport;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getVorname() {
        return Vorname;
    }

    public void setVorname(String vorname) {
        Vorname = vorname;
    }

    public List<Sport> getSport() {
        return sport;
    }

    public void setSport(List<Sport> sport) {
        this.sport = sport;
    }


    //calculeaza totalul minutelor sporturilor din lista utilizatorului
    public double kalkuliereZeit(){

        double total=0;

        for(Sport s:sport){
            total+=s.kalkuliereZeit();
        }
        return total;

    }


    //calculeaza media minutelor sporturilor din lista
    public double kalkuliereDurchschnittszeit(){

        double total = kalkuliereZeit();
        double durchschnittszeit;

        durchschnittszeit=total/sport.size();

        return durchschnittszeit;
    }


    //calculeaza minutele sporturilor dintr-o categorie anume (de echipa sau individual)
    public double kalkuliereZeit(Sport sp){

        double total = 0;
        for(Sport s:sport){
            if(sp.getClass().isInstance(s)){
                total+=s.kalkuliereZeit();
            }

        }
        return total;
    }


}

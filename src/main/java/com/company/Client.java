package com.company;

public class Client {
    private String naam;
    private int leeftijd;
    private int aantalUren; //aantal uren dat deze cliënt in behandeling gaat

    public Client(String naam, int leeftijd, int aantaluren){
        this.naam = naam;
        this.leeftijd = leeftijd;
        this.aantalUren = aantaluren;
    }

    public String getNaam() {
        return naam;
    }

    public int getLeeftijd(){
        return leeftijd;
    }

    public boolean isSenior() {
        return leeftijd>=64;
    }

    public int getAantalUren() {
        return aantalUren;
    }
}

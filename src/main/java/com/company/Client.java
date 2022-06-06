package com.company;

public class Client {
    private String naam;
    private int leeftijd;
    private int aantalUren; //aantal uren dat deze cliënt in behandeling gaat
    int clientnummer;

    public Client(String naam, int leeftijd, int aantaluren, int clientnummer){
        this.naam = naam;
        this.leeftijd = leeftijd;
        this.aantalUren = aantaluren;
        this.clientnummer = clientnummer;
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

    public int getClientnummer(){
        return clientnummer;
    }
    public int getAantalUren() {
        return aantalUren;
    }

    public void printInfo() {
        System.out.println(naam + " " + clientnummer);
    }
}

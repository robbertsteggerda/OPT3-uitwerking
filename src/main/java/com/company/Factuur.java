package com.company;

public abstract class Factuur {
    private final double UURTARIEF;
    private final double UURTARIEF_KORTING;

    {
        UURTARIEF = 75;
    }

    {
        UURTARIEF_KORTING = 70;
    }

    public Factuur(){}

    public abstract double getBTWKosten(double prijs);

    public final double berekenPrijs(Client client){
        double totaalPrijs = berekenAantalUrenPrijs(client.getAantalUren());
        totaalPrijs += getBTWKosten(totaalPrijs);
        if(client.isSenior()){
            totaalPrijs *= 0.9;
        }
        return totaalPrijs;
    }
    private double berekenAantalUrenPrijs (int aantalUren){
        if (aantalUren == 0){
            return 0;
        } else if (aantalUren <= 10){
            return 750;
        } else if(aantalUren<25){
            return UURTARIEF * aantalUren;
        } else{
            return UURTARIEF_KORTING * aantalUren;
        }
    }
}

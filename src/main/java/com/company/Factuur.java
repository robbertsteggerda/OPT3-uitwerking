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
        double totaalPrijs;
        if (client.getAantalUren() == 0){
            totaalPrijs = 0;
        } else if (client.getAantalUren() <= 10){
            totaalPrijs = 750;
        } else if(client.getAantalUren()<25){
            totaalPrijs = UURTARIEF * client.getAantalUren();
        } else{
            totaalPrijs =  UURTARIEF_KORTING * client.getAantalUren();
        }
        totaalPrijs += getBTWKosten(totaalPrijs);
        if(client.isSenior()){
            totaalPrijs *= 0.9;
        }
        return totaalPrijs;
    }
}

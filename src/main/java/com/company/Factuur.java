package com.company;

public abstract class Factuur {
    private double prijs;
    private final double UURTARIEF;
    private final double UURTARIEF_KORTING;

    {
        UURTARIEF = 75;
    }

    {
        UURTARIEF_KORTING = 70;
    }

    public Factuur(double prijs){
        this.prijs = prijs;
    }

    public abstract double getBTWKosten(double prijs);

    public double berekenPrijs(Client client){
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

  //  public double berekenPrijsExBTW(int aantalUren){
    //    if (aantalUren == 0){
    //        return 0;
    //    } else if (aantalUren <= 10){
   //         return 750;
    //    } else if(aantalUren<25){
    //        return UURTARIEF * aantalUren;
    //    } else{
    //        return UURTARIEF_KORTING * aantalUren;
    //    }
   // }

   // public double berekenPrijsIncBTW(Client client){
       // if (!client.isIngeschreven()){
       //     return -1;
       // }
      //  double prijsExBtw = berekenPrijsExBTW(client.getAantalUren());
      //  if(client.isSenior()){
       //     prijsExBtw *= 0.9;
    //    }
       // if(btwToegevoegd) {
       //     return prijsExBtw * 1.21;
       // }
      //  return prijsExBtw;
   // }
}

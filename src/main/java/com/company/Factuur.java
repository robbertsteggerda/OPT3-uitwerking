package com.company;

public class Factuur {
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

    public double berekenPrijsExBTW(int aantalUren){
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

    public double berekenPrijsIncBTW(int aantalUren,boolean btwToegevoegd,boolean senior,boolean ingeschreven){
        if (!ingeschreven){
            return -1;
        }
        double prijsExBtw = berekenPrijsExBTW(aantalUren);
        if(senior){
            prijsExBtw *= 0.9;
        }
        if(btwToegevoegd) {
            return prijsExBtw * 1.21;
        }
        return prijsExBtw;
    }
}

package com.company;

public class IncBTWFactuur extends Factuur {
    public IncBTWFactuur(double prijs) {
        super(prijs);
    }

    @Override
    public double getBTWKosten(double totaalPrijs) {
        return totaalPrijs * 0.21;
    }
}

package com.company;

public class IncBTWFactuur extends Factuur {
    public IncBTWFactuur() {
        super();
    }

    @Override
    public double getBTWKosten(double totaalPrijs) {
        return totaalPrijs * 0.21;
    }
}

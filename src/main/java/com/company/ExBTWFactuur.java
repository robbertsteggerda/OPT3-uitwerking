package com.company;

import com.company.Factuur;

public class ExBTWFactuur extends Factuur {
    public ExBTWFactuur(double prijs) {
        super(prijs);
    }

    @Override
    public double getBTWKosten(double totaalPrijs) {
        return 0;
    }
}

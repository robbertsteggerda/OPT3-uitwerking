package com.company;

import com.company.Factuur;

public class ExBTWFactuur extends Factuur {
    public ExBTWFactuur() {
        super();
    }

    @Override
    public double getBTWKosten(double totaalPrijs) {
        return 0;
    }
}

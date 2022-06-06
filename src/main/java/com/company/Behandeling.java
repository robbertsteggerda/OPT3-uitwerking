package com.company;

public class Behandeling {
    private boolean isBTWOpgeteld;
    private boolean isBedragAfgerond;
    private boolean zijnGegevensOpgehaald;

    public Behandeling(boolean isBTWOpgeteld, boolean isBedragAfgerond, boolean zijnGegevensOpgehaald){
        this.isBTWOpgeteld = isBTWOpgeteld;
        this.isBedragAfgerond = isBedragAfgerond;
        this.zijnGegevensOpgehaald = zijnGegevensOpgehaald;
    }

    public boolean moetFactuurOpgemaaktWorden (){
        return (this.isBTWOpgeteld && this.isBedragAfgerond && this.zijnGegevensOpgehaald);
    }
}

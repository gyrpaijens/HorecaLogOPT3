package com.company;

public abstract class Kosten
{
    final void getKosten()
    {
        if (isPersoneel())
        {
            getDagloon();
        }
        else{
            getPrijs();
        }
    }

    abstract double getPrijs();
    abstract double getDagloon();
    abstract void printDetails();
    boolean isPersoneel(){ return false; }
}


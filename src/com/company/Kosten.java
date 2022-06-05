package com.company;

public abstract class Kosten
{
    public final void check()
    {
        if (isPersoneel())
        {
            checkDagLoon();
        }
        else{
            checkKosten();
        }
        printDetails();
    }

    public final double getKosten()
    {
        if (isPersoneel())
        {
            return getDagloon();
        }
        else{
            return getPrijs();
        }
    }

    abstract double getPrijs();
    abstract double getDagloon();
    abstract void checkKosten();
    abstract void checkDagLoon();
    abstract void printDetails();
    boolean isPersoneel(){ return false; }
}


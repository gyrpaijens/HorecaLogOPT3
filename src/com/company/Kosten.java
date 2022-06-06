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

    public abstract double getPrijs();
    public abstract double getDagloon();
    public abstract void checkKosten();
    public abstract void checkDagLoon();
    public abstract void printDetails();
    public boolean isPersoneel(){ return false; }
}


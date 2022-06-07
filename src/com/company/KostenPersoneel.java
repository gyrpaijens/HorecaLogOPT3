package com.company;

public class KostenPersoneel extends Kosten
{
    private double Dagloon;
    private String Naam;
    private boolean geldig;
    public KostenPersoneel(double Dagloon, String Naam)
    {
        this.Dagloon = Dagloon;
        this.Naam = Naam;
    }

    @Override
    public boolean isPersoneel() {
        return true;
    }

    @Override
    public double getPrijs() {
        return 0;
    }

    @Override
    public double getDagloon() {
        return Dagloon;
    }
    @Override
    public void printDetails() {
        System.out.println(Naam + ": " + Dagloon);
        if(geldig)
        {
            System.out.println("De ingevulde dagloon klopt.");
        }
        else
        {
            System.out.println("De ingevulde dagloon klopt niet.");
        }
    }

    @Override
    public void checkKosten()
    {
        //methode wordt niet gebruikt.
    }

    @Override
    public void checkDagLoon() {
        if(Dagloon > 0 && Dagloon < 1000)
        {
            geldig = true;
        }
        else
        {
            geldig = false;
        }
    }
}

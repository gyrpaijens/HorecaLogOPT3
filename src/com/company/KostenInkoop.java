package com.company;

public class KostenInkoop extends Kosten
{
    private double Prijs;
    private String Naam;
    private boolean geldig;
    public KostenInkoop(double Prijs, String Naam)
    {
        this.Prijs = Prijs;
        this.Naam = Naam;
    }

    @Override
    public double getPrijs() {
        return Prijs;
    }

    @Override
    public double getDagloon() {
        return 0;
    }

    @Override
    public void printDetails() {
        System.out.println(Naam + ": " + Prijs);
        if(geldig)
        {
            System.out.println("De kosten zijn geldig.");
        }
        else
        {
            System.out.println("De kosten zijn verkeerd ingevoerd.");
        }
    }

    @Override
    public void checkKosten() {
        if(Prijs > 0 && Prijs < 100000)
        {
            geldig = true;
        }
        else
        {
            geldig = false;
        }
    }

    @Override
    public void checkDagLoon() {
        // methode wordt niet gebruikt.
    }
}

package com.company;

public class KostenInkoop extends Kosten
{
    private double Prijs;
    private String Naam;
    KostenInkoop(double Prijs, String Naam)
    {
        this.Prijs = Prijs;
        this.Naam = Naam;
        printDetails();
    }


    @Override
    double getPrijs() {
        return Prijs;
    }

    @Override
    double getDagloon() {
        return 0;
    }

    @Override
    void printDetails() {
        System.out.println(Naam + ": " + Prijs);
    }
}

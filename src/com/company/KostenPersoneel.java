package com.company;

public class KostenPersoneel extends Kosten
{
    private double Dagloon;
    private double Naam;
    KostenPersoneel(double Dagloon, String Naams)
    {
        this.Dagloon = Dagloon;
        this.Naam = Naam;
        printDetails();
    }

    @Override
    boolean isPersoneel() {
        return false;
    }

    @Override
    double getPrijs() {
        return 0;
    }

    @Override
    double getDagloon() {
        return Dagloon;
    }
    @Override
    void printDetails() {
        System.out.println(Naam + ": " + Dagloon);
    }
}

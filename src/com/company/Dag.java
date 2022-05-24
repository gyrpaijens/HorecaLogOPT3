package com.company;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Dag {
    private double Omzet;
    private double Kosten;
    private Calendar Dag;
    private ArrayList<Kosten> Inkopen;


    public Dag(GregorianCalendar dag, double Omzet, double Kosten)
    {
        this.Dag = dag;
        this.Omzet = Omzet;
        //this.Kosten = Kosten;
    }
    public Dag(GregorianCalendar dag, double Omzet)
    {
        this.Dag = dag;
        this.Omzet = Omzet;
        this.Kosten = Kosten;
    }

    public double getVerschil() {
        int a = 0;
        for (Kosten inkoop : Inkopen)
        {
            a += (int)inkoop.getPrijs();
        }
        return Omzet - a;
    }

    public Calendar getDag() {
        return Dag;
    }

    public double getKosten() {
        return Kosten;
    }

    public double getOmzet() {
        return Omzet;
    }


    public void setInkopen(ArrayList<Kosten> inkopen) {
        this.Inkopen = inkopen;
    }
    public ArrayList<Kosten> getInkopen() {
        return Inkopen;
    }

}
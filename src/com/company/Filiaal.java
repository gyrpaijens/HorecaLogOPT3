package com.company;

import com.company.Interfaces.IAccount;
import com.company.Interfaces.IAdres;
import com.company.Interfaces.IFiliaal;

import java.util.ArrayList;

public class Filiaal implements IFiliaal{
    private String Naam;
    private String Postcode;
    private String Nummer;
    private ArrayList<IAccount> Medewerkers;
    private ArrayList<Dag> dagen;
    private Adres adres;

    Filiaal(String Naam)
    {
        this.Naam = Naam;
        this.Medewerkers = new ArrayList<IAccount>();
        this.dagen = new ArrayList<Dag>();
    }

    public void addDag(Dag dag)
    {
        dagen.add(dag);
        // order by datum
    }

    public void AddMedewerker (IAccount medewerker)
    {
        Medewerkers.add(medewerker);
    }

    public String getNaam() {
        return Naam;
    }

    public ArrayList<IAccount> getMedewerker()
    {
        return Medewerkers;
    }

    public ArrayList<Dag> getDagen()
    {
        return dagen;
    }

    public Adres getAdres() {
        return adres;
    }

    public void setAdres(Adres adres) {
        this.adres = adres;
    }
}

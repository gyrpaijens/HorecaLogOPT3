package com.company;

import com.company.Interfaces.IAccount;
import com.company.Interfaces.IAdres;
import com.company.Interfaces.IFiliaal;

import java.util.ArrayList;

public class Filiaal implements IFiliaal, IAdres {
    private String Naam;
    private String Postcode;
    private String Nummer;
    private ArrayList<IAccount> Medewerkers;
    private ArrayList<Dag> dagen;

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

    public String getPostcode() {
        return Postcode;
    }

    public void setPostcode(String postcode) {
        if (AccountMethoden.checkPostcode(Postcode)) {
            this.Postcode = postcode;
        }
    }

    public ArrayList<Dag> getDagen()
    {
        return dagen;
    }

    public String getNummer() {
        return Nummer;
    }

    public void setNummer(String nummer) {
        Nummer = nummer;
    }
}

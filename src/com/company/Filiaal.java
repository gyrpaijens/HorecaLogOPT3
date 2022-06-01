package com.company;

import java.util.ArrayList;

public class Filiaal {
    private String Naam;
    private String Postcode;
    private String Nummer;
    private ArrayList<IMedewerker> Medewerkers;

    Filiaal(String Naam)
    {
        this.Naam = Naam;
        this.Medewerkers = new ArrayList<IMedewerker>();
    }

    public void AddMedewerker (IMedewerker medewerker)
    {
        Medewerkers.add(medewerker);
    }

    public String getNaam() {
        return Naam;
    }

    public String getPostcode() {
        return Postcode;
    }

    public void setPostcode(String postcode) {
        if (AccountMethoden.checkPostcode(Postcode)) {
            this.Postcode = postcode;
        }
    }

    public String getNummer() {
        return Nummer;
    }

    public void setNummer(String nummer) {
        Nummer = nummer;
    }
}

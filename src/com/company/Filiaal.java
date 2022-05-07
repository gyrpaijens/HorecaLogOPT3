package com.company;

import java.util.ArrayList;

public class Filiaal {
    private String Naam;
    private String Postcode;
    private String Nummer;

    Filiaal(String Naam)
    {
        this.Naam = Naam;
    }

    public String getNaam() {
        return Naam;
    }

    public String getPostcode() {
        return Postcode;
    }

    public void setPostcode(String postcode) {
        Postcode = postcode;
    }

    public String getNummer() {
        return Nummer;
    }

    public void setNummer(String nummer) {
        Nummer = nummer;
    }
}

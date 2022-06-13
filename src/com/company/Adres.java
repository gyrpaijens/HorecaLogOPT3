package com.company;

import com.company.Interfaces.IAdres;

public class Adres implements IAdres
{
    private String postcode;
    // nummer is een string omdat huisnummers ook soms letters bevatten.
    private String nummer;
    private String stad;

    @Override
    public String getPostcode() {
        return postcode;
    }


    @Override
    public void setPostcode(String postcode) {
        if (AccountMethoden.checkPostcode(postcode)) {
            this.postcode = postcode;
        }
    }

    @Override
    public String getNummer() {
        return nummer;
    }

    @Override
    public void setNummer(String nummer) {
        this.nummer = nummer;
    }

    @Override
    public String getStad() {
        return stad;
    }

    @Override
    public void setStad(String stad) {
        this.stad = stad;
    }
}

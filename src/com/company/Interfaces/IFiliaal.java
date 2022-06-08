package com.company.Interfaces;

import com.company.Adres;
import com.company.Dag;

import java.util.ArrayList;

public interface IFiliaal
{
    public void addDag(Dag dag);
    public void AddMedewerker (IAccount medewerker);
    public String getNaam();
    public ArrayList<IAccount> getMedewerker();
    public ArrayList<Dag> getDagen();
    public Adres getAdres();
    public void setAdres(Adres adres);
}

package com.company.Interfaces;

import com.company.Filiaal;

import java.util.ArrayList;

public interface IAccount
{
    String GetUserName();
    String GetPassword();
    Filiaal GetFiliaal();
    public int getLeeftijd();
    public void setLeeftijd(int leeftijd);
    public String getSoortMedewerker();
    public void setSoortMedewerker(String soortMedewerker);
    public void printDetials();
}

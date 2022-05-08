package com.company;

import java.util.ArrayList;

public interface IAccount
{
    String GetUserName();
    String GetPassword();
    String GetFiliaal();
    public int getLeeftijd();
    public void setLeeftijd(int leeftijd);
    public String getSoortMedewerker();
    public void setSoortMedewerker(String soortMedewerker);
}

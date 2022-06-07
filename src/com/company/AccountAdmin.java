package com.company;

import com.company.Interfaces.IAccount;

public class AccountAdmin implements IAccount {
    private String UserName;
    private String PassWord;
    private Filiaal Filiaal;
    private String SoortMedewerker;
    private int Leeftijd;
    public boolean ingelogd;

    public AccountAdmin(String userName, String passWord, Filiaal Filiaal)
    {
        this.UserName = userName;
        this.PassWord = passWord;
        this.Filiaal = Filiaal;
    }

    @Override
    public int getLeeftijd() {
        return Leeftijd;
    }
    @Override
    public void setLeeftijd(int leeftijd) {
        Leeftijd = leeftijd;
    }
    @Override
    public String getSoortMedewerker() {
        return SoortMedewerker;
    }
    @Override
    public void setSoortMedewerker(String soortMedewerker) {
        SoortMedewerker = soortMedewerker;
    }

    @Override
    public String GetUserName() {
        return UserName;
    }

    @Override
    public String GetPassword() {
        return PassWord;
    }

    @Override
    public Filiaal GetFiliaal() {
        return Filiaal;
    }

    public void printDetials()
    {
        //print details
    }

}

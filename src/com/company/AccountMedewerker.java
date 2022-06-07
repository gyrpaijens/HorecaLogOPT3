package com.company;

public class AccountMedewerker
{
    private String UserName;
    private String PassWord;
    private Filiaal Filiaal;
    private String SoortMedewerker;
    private int Leeftijd;
    public boolean ingelogd;
    private double dagLoon;

    public AccountMedewerker(String userName, String passWord, Filiaal Filiaal)
    {
        this.UserName = userName;
        this.PassWord = passWord;
        this.Filiaal = Filiaal;
    }
    public int pakLeeftijd() {
        return Leeftijd;
    }
    public void zetLeeftijd(int leeftijd) {
        Leeftijd = leeftijd;
    }
    public String pakSoortMedewerker() {
        return SoortMedewerker;
    }
    public void zetSoortMedewerker(String soortMedewerker) {
        SoortMedewerker = soortMedewerker;
    }
    public String pakGebruikersnaam() {
        return UserName;
    }
    public String pakWachtwoord() {
        return PassWord;
    }
    public Filiaal bekijkFiliaal() {
        return Filiaal;
    }
    public void zetDagLoon(double dagLoon)
    {
        this.dagLoon = dagLoon;
    }
    public double pakDagLoon(){return dagLoon; }

    public void bekijkRooster()
    {
        System.out.println("Rooster.");
    }
    public void bekijkDagLoon()
    {
        //voorbeeld dat een medewerker een heel ander account heeft
        System.out.println("Dagloon is: " + dagLoon);
    }

}

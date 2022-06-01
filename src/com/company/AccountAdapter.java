package com.company;

import com.company.Interfaces.IAccount;

public class AccountAdapter implements IAccount
{

    AccountMedewerker account;
    public AccountAdapter(AccountMedewerker account)
    {
        this.account = account;
    }

    public void SetDagLoon(double dagloon)
    {
        account.zetDagLoon(dagloon);
    }

    @Override
    public String GetUserName() {
        return account.pakGebruikersnaam();
    }

    @Override
    public String GetPassword() {
        return account.pakWachtwoord();
    }

    @Override
    public Filiaal GetFiliaal() {
        return account.bekijkFiliaal();
    }

    @Override
    public int getLeeftijd() {
        return account.pakLeeftijd();
    }

    @Override
    public void setLeeftijd(int leeftijd) {
        account.zetLeeftijd(leeftijd);
    }

    @Override
    public String getSoortMedewerker() {
        return account.pakSoortMedewerker();
    }

    @Override
    public void setSoortMedewerker(String soortMedewerker) {
        account.zetSoortMedewerker(soortMedewerker);
    }

    @Override
    public void printDetials() {
        account.bekijkDagLoon();
    }
    public void BekijkRooster()
    {
        account.bekijkRooster();
    }


}

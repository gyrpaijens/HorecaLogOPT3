package com.company;

import java.util.ArrayList;

public class AccountMethoden {
    public static Account logIn(String gebruikersnaam, String wachtwoord, ArrayList<Account> accounts)
    {
        Account account;
        for(Account a : accounts)
        {
            if (a.GetUserName().equals(gebruikersnaam) && (a.GetPassword().equals(wachtwoord) || a.ingelogd == true))
            {
                account = a;
                return a;
            }
        }
        return null;
    }
    public static Account aanmakenRechten(Account account, String Soort, int leeftijd, boolean bsn, boolean Geboortedatum)
    {
        if(Geboortedatum && bsn)
        {
            if(leeftijd > 17 && (Soort.equals("Manager") || Soort.equals("Eigenaar")))
            {
                account.setLeeftijd(leeftijd);
                account.setSoortMedewerker(Soort);
                return account;
            }

            if(leeftijd < 18 && ( Soort.equals("Manager") || Soort.equals("Eigenaar")))
            {
                return null;
            }
            if(leeftijd > 14 && Soort.equals("Medewerker"))
            {
                account.setLeeftijd(leeftijd);
                account.setSoortMedewerker(Soort);
                return account;
            }
            return null;
        }

        else
            {
            return null;
            }
    }
}

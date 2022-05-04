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
}

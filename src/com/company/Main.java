package com.company;

import com.company.Interfaces.IAccount;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        /*Filiaal filiaal = new Filiaal("Delft");
        ArrayList<IAccount> accounts = new ArrayList<IAccount>();
        accounts.add(new AccountAdmin("Gyr", "123", filiaal));
        accounts.add(new AccountAdmin("Jan", "123", filiaal));
        accounts.add(new AccountAdmin("Piet", "123", filiaal));
        accounts.add(new AccountAdmin("Henk", "123", filiaal));
        accounts.add(new AccountAdmin("Jip", "123", filiaal));
        accounts.add(new AccountAdapter( new AccountMedewerker("Pim", "123", filiaal)));
        for(IAccount account : accounts)
        {
            filiaal.AddMedewerker(account);
        }

        System.out.println(filiaal.getMedewerker().get(5).GetUserName());
        */
        Kosten kostenInkoop = new KostenPersoneel( 12,"A");
        kostenInkoop.check();
        //test
    }
}

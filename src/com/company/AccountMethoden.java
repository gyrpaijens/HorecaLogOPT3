package com.company;

import com.company.Interfaces.IAccount;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.ArrayList;
import java.util.Calendar;

public class AccountMethoden {
    public static IAccount logIn(String gebruikersnaam, String wachtwoord, ArrayList<IAccount> accounts) {
        IAccount account;
        for (IAccount a : accounts) {
            if (a.GetUserName().equals(gebruikersnaam) && (a.GetPassword().equals(wachtwoord))) {
                account = a;
                return a;
            }
        }
        return null;
    }

    public static AccountAdmin aanmakenRechten(AccountAdmin account, String Soort, int leeftijd, boolean bsn, boolean Geboortedatum) {
        if (Geboortedatum && bsn) {
            if (leeftijd > 17 && (Soort.equals("Manager") || Soort.equals("Eigenaar"))) {
                account.setLeeftijd(leeftijd);
                account.setSoortMedewerker(Soort);
                return account;
            }

            if (leeftijd < 18 && (Soort.equals("Manager") || Soort.equals("Eigenaar"))) {
                return null;
            }
            if (leeftijd > 14 && Soort.equals("Medewerker")) {
                account.setLeeftijd(leeftijd);
                account.setSoortMedewerker(Soort);
                return account;
            }
            return null;
        } else {
            return null;
        }
    }

    public static boolean checkPostcode(String Postcode) {
        boolean check = false;
        int a = Postcode.length();

        if (a == 6) {
            check = true;
            for (int i = 0; i < 4; i++) {
                if ((Character.isLetter(Postcode.charAt(i))))
                {
                    check = false;
                }
            }
            for (int i = 4; i < 6; i++) {
                if (Character.isDigit(Postcode.charAt(i)))
                {
                    check = false;
                    //5555xx
                }
            }
        }
        return check;
    }

    public static void printAlleGegevens(IAccount account)
    {
        if(account instanceof AccountAdmin) {
        ArrayList<Dag> omzet = account.GetFiliaal().getDagen();
        for(Dag dagen : omzet)
            {
                System.out.println("Gegevens van dag " + dagen.getDag().get(Calendar.DAY_OF_MONTH)
                        + " / " + dagen.getDag().get(Calendar.MONTH) + " / " + dagen.getDag().get(Calendar.YEAR));
                System.out.println("Omzet: " + dagen.getOmzet());
                System.out.println("Kosten: " + dagen.getKosten());
                System.out.println(("Verschil: "  + dagen.getVerschil()));
            }
        }
        else{
            System.out.println("U heeft hier geen recht op.");
        }
    }
    public static void kostenBekijken(IAccount account)
    {
        Filiaal filiaal = account.GetFiliaal();
        ArrayList<Dag> dagen = filiaal.getDagen();
        for (Dag dag : dagen) {
            System.out.println("De kosten van " + dag.getDag().toString());
            for (Kosten kosten : dag.getInkopen()) {
                System.out.println("Uitgave: " + kosten.getPrijs());
            }
            System.out.println("De totale kosten zijn: " + dag.getKosten());
        }

    }
    public static void loonBekijken(IAccount account)
    {
        if(account instanceof AccountAdapter)
        {
            AccountAdapter account1 = (AccountAdapter) account;
            System.out.println("Uw dagloon is: "+ account1.getDagLoon());
        }
        else{
            System.out.println("Als admin is geen dagloon bekend.");
        }
    }
}


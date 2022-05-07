package com.company;

import java.util.ArrayList;

public class AccountMethoden {
    public static Account logIn(String gebruikersnaam, String wachtwoord, ArrayList<Account> accounts) {
        Account account;
        for (Account a : accounts) {
            if (a.GetUserName().equals(gebruikersnaam) && (a.GetPassword().equals(wachtwoord) || a.ingelogd == true)) {
                account = a;
                return a;
            }
        }
        return null;
    }

    public static Account aanmakenRechten(Account account, String Soort, int leeftijd, boolean bsn, boolean Geboortedatum) {
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
}


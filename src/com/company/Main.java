package com.company;

import com.company.Interfaces.IAccount;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<IAccount> accounts = voorbeeldAccounts();
        //voorbeeld wat dan in het database zou staan^
        IAccount account = logIn(accounts);
        menu(account);

        /*
        System.out.println(filiaal.getMedewerker().get(5).GetUserName());
        Kosten kostenInkoop = new KostenPersoneel( 12,"A");
        kostenInkoop.check();
        */

    }

    public static IAccount logIn(ArrayList<IAccount> accounts)
    {
        boolean a = true;
        Scanner scanner = new Scanner(System.in);
        IAccount account = null;

        while(a)
        {
            System.out.println("Inloggen");
            System.out.println("Vul uw gebruikersnaam in:");
            String gebruikersnaam = scanner.nextLine();
            System.out.println("Vul uw wachtwoord in:");
            String wachtwoord = scanner.nextLine();
            account = AccountMethoden.logIn(gebruikersnaam,wachtwoord, accounts);
            if(account !=null)
            {
                a = false;
            }
            else{
                System.out.println("Mislukt, gebruikersnaam of wachtwoord klopt niet.");
            }
        }
        System.out.println("Welkom " + account.GetUserName() + ", u bent ingelogd.");
        return account;
    }
    public static void menu(IAccount account)
    {
        Scanner scan = new Scanner(System.in);
        boolean x = false;

        while (x == false) {
            System.out.println("U kunt de volgende dingen doen: ");
            System.out.println("1. De gegevens van alle dagen bekijken");
            System.out.println("2. De kosten bekijken");
            System.out.println("3. Uw loonbekijken");
            String input = scan.nextLine();

            if (input.equals("1")) {
                AccountMethoden.printAlleGegevens(account);
                x = true;
            } else if (input.equals("2")) {
                AccountMethoden.kostenBekijken(account);
                x = true;
            } else if (input.equals("3")) {
                AccountMethoden.loonBekijken(account);
                x = true;

            } else {
                System.out.println("Ongeldige input");
            }

            System.out.println("Wilt u doorgaan?");
            System.out.println("1. Ja");
            System.out.println("2. Nee");
            input = scan.nextLine();
            if (input.equals("1")) x = false;
        }
    }
    public static ArrayList<IAccount> voorbeeldAccounts()
    {
        Filiaal filiaal = new Filiaal("Delft");
        ArrayList<Dag> dagen = voorbeeldDagen();
        for(Dag dag : dagen)
        {
            filiaal.addDag(dag);
        }
        ArrayList<IAccount> accounts = new ArrayList<IAccount>();
        accounts.add(new AccountAdmin("Gyr", "123", filiaal));
        accounts.add(new AccountAdmin("Jan", "123", filiaal));
        accounts.add(new AccountAdmin("Piet", "123", filiaal));
        accounts.add(new AccountAdmin("Henk", "123", filiaal));
        accounts.add(new AccountAdmin("Jip", "123", filiaal));
        AccountAdapter pim = new AccountAdapter( new AccountMedewerker("Pim", "123", filiaal));
        pim.SetDagLoon(300);
        accounts.add(pim);
        for(IAccount account : accounts)
        {
            filiaal.AddMedewerker(account);
        }
        return accounts;
    }
    public static ArrayList<Dag> voorbeeldDagen()
    {
        ArrayList<Dag> dagen = new ArrayList<Dag>();
        for (int i = 1; i < 32; i++)
        {
            int year = 2021;
            int month = 12;
            Dag dag = new Dag(new GregorianCalendar(year, month, i),10000);
            ArrayList<Kosten> kosten = new ArrayList<Kosten>();
            kosten.add(new KostenPersoneel(550, "Gyr"));
            kosten.add(new KostenPersoneel(50, "Jan"));
            kosten.add(new KostenPersoneel(50, "Henk"));
            kosten.add(new KostenInkoop(30, "Boter"));
            kosten.add(new KostenInkoop(50, "Eieren"));
            kosten.add(new KostenInkoop(390, "Vlees"));
            dag.setInkopen(kosten);
            dagen.add(dag);
        }
        return dagen;
    }
}

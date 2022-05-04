package com.company;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.GregorianCalendar;

import static org.junit.Assert.*;

public class JUnitTesten
{
    //om niet de hele tijd calender en account objecten aan te maken heb ik de maar hier gezet.
    GregorianCalendar calendar = new GregorianCalendar(2022,03,27);
    GregorianCalendar calendar2 = new GregorianCalendar(2022,03,28);

    Account account = new Account("gyr","wachtwoord","test");

    // 1e MC/DC
    @Test
    public void testLogin()
    {
        ArrayList<Account> accounts = new ArrayList<Account>();
        account.ingelogd = true;
        accounts.add(account);
        Account verwacht = account;
        Account actueel = AccountMethoden.logIn("gyr","wachtwoord", accounts );
        Assert.assertEquals(verwacht, actueel);
    }
    // 2e MC/DC
    @Test
    public void testLogin()
    {
        ArrayList<Account> accounts = new ArrayList<Account>();
        account.ingelogd = false;
        accounts.add(account);
        Account verwacht = account;
        Account actueel = AccountMethoden.logIn("gyr","wachtwoord", accounts );
        Assert.assertEquals(verwacht, actueel);
    }
    // 3e MC/DC
    @Test
    public void testLogin()
    {
        ArrayList<Account> accounts = new ArrayList<Account>();
        account.ingelogd = false;
        accounts.add(account);
        Account actueel = AccountMethoden.logIn("gyr","foutwachtwoord", accounts );
        Assert.assertNull(actueel);
    }
    @Test
    public void testLogin()
    {
        ArrayList<Account> accounts = new ArrayList<Account>();
        account.ingelogd = false;
        accounts.add(account);
        Account verwacht = account;
        Account actueel = AccountMethoden.logIn("gyr","wachtwoord", accounts );
        Assert.assertEquals(verwacht, actueel);
    }
    @Test
    public void testLogin()
    {
        ArrayList<Account> accounts = new ArrayList<Account>();
        account.ingelogd = true;
        accounts.add(account);
        Account verwacht = account;
        Account actueel = AccountMethoden.logIn("gyr","foutwachtwoord", accounts );
        Assert.assertEquals(verwacht, actueel);
    }





}

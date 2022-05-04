package com.company;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.GregorianCalendar;

import static org.junit.Assert.*;

public class JUnitTesten
{
    Account account = new Account("gyr","wachtwoord","test");

    // 1e rij MC/DC
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
    // 2e rij MC/DC
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
    // 3e rij MC/DC
    @Test
    public void testLogin()
    {
        ArrayList<Account> accounts = new ArrayList<Account>();
        account.ingelogd = false;
        accounts.add(account);
        Account actueel = AccountMethoden.logIn("gyr","foutwachtwoord", accounts );
        Assert.assertNull(actueel);
    }
    // 4e rij MC/DC
    @Test
    public void testLogin()
    {
        ArrayList<Account> accounts = new ArrayList<Account>();
        account.ingelogd = true;
        accounts.add(account);
        Account verwacht = account;
        Account actueel = AccountMethoden.logIn("nietgyr","foutwachtwoord", accounts );
        Assert.assertNull(actueel);
    }
    //5e rij MC/DC
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
    //6e rij MC/DC
    @Test
    public void testLogin()
    {
        ArrayList<Account> accounts = new ArrayList<Account>();
        account.ingelogd = true;
        accounts.add(account);
        Account actueel = AccountMethoden.logIn("nietgyr","foutwachtwoord", accounts );
        Assert.assertNull(verwacht);
    }





}

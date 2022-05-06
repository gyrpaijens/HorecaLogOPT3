package com.company;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
public class JUnitTesten
{
    Account account = new Account("gyr","wachtwoord","test");

    // 1e rij MC/DC
    @Test
    public void testLogin1()
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
    public void testLogin2()
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
    public void testLogin3()
    {
        ArrayList<Account> accounts = new ArrayList<Account>();
        account.ingelogd = false;
        accounts.add(account);
        Account actueel1 = AccountMethoden.logIn("gyr","foutiefwachtwoord", accounts );
        Assert.assertNull(actueel1);
    }
    // 4e rij MC/DC
    @Test
    public void testLogin4()
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
    public void testLogin5()
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
    public void testLogin6()
    {
        ArrayList<Account> accounts = new ArrayList<Account>();
        account.ingelogd = true;
        accounts.add(account);
        Account actueel = AccountMethoden.logIn("nietgyr","foutwachtwoord", accounts );
        Assert.assertNull(actueel);
    }
    @Test
    public void testRechten()
    {
        Assert.assertNull(AccountMethoden.aanmakenRechten(
                account, "Eigenaar", 4, true, true));
        Assert.assertNotNull(AccountMethoden.aanmakenRechten(
                account, "Eigenaar", 30, true, true));
        Assert.assertNotNull(AccountMethoden.aanmakenRechten(
                account, "Medewerker", 15, true, true));
        Assert.assertNull(AccountMethoden.aanmakenRechten(
                account, "Medewerker", 12, true, true));
        Assert.assertNull(AccountMethoden.aanmakenRechten(
                account, "Medewerker", 15, false, true));
        Assert.assertNull(AccountMethoden.aanmakenRechten(
                account, "Manager", 16, true, true));
        Assert.assertNotNull(AccountMethoden.aanmakenRechten(
                account, "Manager", 29, true, true));
        Assert.assertNull(AccountMethoden.aanmakenRechten(
                account, "Manager", 39, true, false));


    }
}

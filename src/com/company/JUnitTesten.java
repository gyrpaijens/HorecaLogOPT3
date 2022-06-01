package com.company;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
public class JUnitTesten
{
    AccountAdmin account = new AccountAdmin("gyr","wachtwoord",new Filiaal("a"));

    // 1e rij MC/DC
    @Test
    public void testLogin1()
    {
        ArrayList<AccountAdmin> accounts = new ArrayList<AccountAdmin>();
        account.ingelogd = true;
        accounts.add(account);
        AccountAdmin verwacht = account;
        AccountAdmin actueel = AccountMethoden.logIn("gyr","wachtwoord", accounts );
        Assert.assertEquals(verwacht, actueel);
    }
    // 2e rij MC/DC
    @Test
    public void testLogin2()
    {
        ArrayList<AccountAdmin> accounts = new ArrayList<AccountAdmin>();
        account.ingelogd = false;
        accounts.add(account);
        AccountAdmin verwacht = account;
        AccountAdmin actueel = AccountMethoden.logIn("gyr","wachtwoord", accounts );
        Assert.assertEquals(verwacht, actueel);
    }
    // 3e rij MC/DC
    @Test
    public void testLogin3()
    {
        ArrayList<AccountAdmin> accounts = new ArrayList<AccountAdmin>();
        account.ingelogd = false;
        accounts.add(account);
        AccountAdmin actueel1 = AccountMethoden.logIn("gyr","foutiefwachtwoord", accounts );
        Assert.assertNull(actueel1);
    }
    // 4e rij MC/DC
    @Test
    public void testLogin4()
    {
        ArrayList<AccountAdmin> accounts = new ArrayList<AccountAdmin>();
        account.ingelogd = true;
        accounts.add(account);
        AccountAdmin verwacht = account;
        AccountAdmin actueel = AccountMethoden.logIn("nietgyr","foutwachtwoord", accounts );
        Assert.assertNull(actueel);
    }
    //5e rij MC/DC
    @Test
    public void testLogin5()
    {
        ArrayList<AccountAdmin> accounts = new ArrayList<AccountAdmin>();
        account.ingelogd = true;
        accounts.add(account);
        AccountAdmin verwacht = account;
        AccountAdmin actueel = AccountMethoden.logIn("gyr","foutwachtwoord", accounts );
        Assert.assertEquals(verwacht, actueel);
    }
    //6e rij MC/DC
    @Test
    public void testLogin6()
    {
        ArrayList<AccountAdmin> accounts = new ArrayList<AccountAdmin>();
        account.ingelogd = true;
        accounts.add(account);
        AccountAdmin actueel = AccountMethoden.logIn("nietgyr","foutwachtwoord", accounts );
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
    @Test
    public void testPostcode()
    {
        Assert.assertFalse(AccountMethoden.checkPostcode("261314SG"));
        Assert.assertTrue(AccountMethoden.checkPostcode("2611AB"));

        Assert.assertFalse(AccountMethoden.checkPostcode("ABCDEF"));
        Assert.assertTrue(AccountMethoden.checkPostcode("1234AB"));

        Assert.assertFalse(AccountMethoden.checkPostcode("123456"));
        Assert.assertTrue(AccountMethoden.checkPostcode("5246NL"));
    }
}

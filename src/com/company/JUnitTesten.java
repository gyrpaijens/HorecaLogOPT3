package com.company;

import com.company.Interfaces.IAccount;
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
        ArrayList<IAccount> accounts = new ArrayList<IAccount>();
        account.ingelogd = true;
        accounts.add(account);
        IAccount verwacht = account;
        IAccount actueel = (IAccount)AccountMethoden.logIn("gyr","wachtwoord", accounts );
        Assert.assertEquals(verwacht, actueel);
    }
    // 2e rij MC/DC
    @Test
    public void testLogin2()
    {
        ArrayList<IAccount> accounts = new ArrayList<IAccount>();
        account.ingelogd = false;
        accounts.add(account);
        IAccount verwacht = account;
        IAccount actueel = AccountMethoden.logIn("gyr","wachtwoord", accounts );
        Assert.assertEquals(verwacht, actueel);
    }
    // 3e rij MC/DC
    @Test
    public void testLogin3()
    {
        ArrayList<IAccount> accounts = new ArrayList<IAccount>();
        account.ingelogd = false;
        accounts.add(account);
        IAccount actueel1 = AccountMethoden.logIn("gyr","foutiefwachtwoord", accounts );
        Assert.assertNull(actueel1);
    }
    // 4e rij MC/DC
    @Test
    public void testLogin4()
    {
        ArrayList<IAccount> accounts = new ArrayList<IAccount>();
        account.ingelogd = true;
        accounts.add(account);
        IAccount verwacht = account;
        IAccount actueel = AccountMethoden.logIn("nietgyr","foutwachtwoord", accounts );
        Assert.assertNull(actueel);
    }

    //6e rij MC/DC
    @Test
    public void testLogin6()
    {
        ArrayList<IAccount> accounts = new ArrayList<IAccount>();
        account.ingelogd = true;
        accounts.add(account);
        IAccount actueel = AccountMethoden.logIn("nietgyr","foutwachtwoord", accounts );
        Assert.assertNull(actueel);
    }


    @Test
    public void testPostcode()
    {
    Assert.assertFalse(AccountMethoden.checkPostcode("26131a4SG"));
        Assert.assertTrue(AccountMethoden.checkPostcode("2611AB"));

        Assert.assertFalse(AccountMethoden.checkPostcode("ABCDEF"));
        Assert.assertTrue(AccountMethoden.checkPostcode("1234AB"));

        Assert.assertFalse(AccountMethoden.checkPostcode("123456"));
        Assert.assertTrue(AccountMethoden.checkPostcode("5246NL"));
    }
}

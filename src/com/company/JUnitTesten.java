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
    @Test
    public void testWinstBelasting()
    {
        double test1 = AccountMethoden.berekenWinstBelasting(1);
        double test1Verwacht = 1 * 0.2;
        Assert.assertEquals(test1Verwacht,test1,0.0001);

        double test2 = AccountMethoden.berekenWinstBelasting(50000);
        double test2Verwacht = 50000 * 0.2;
        Assert.assertEquals(test2Verwacht,test2,0.0001);

        double test3 = AccountMethoden.berekenWinstBelasting(50001);
        double test3Verwacht = 50000 * 0.2 + 1 * 0.25;
        Assert.assertEquals(test3Verwacht,test3,0.0001);

        double test4 = AccountMethoden.berekenWinstBelasting(100000);
        double test4Verwacht = 50000 * 0.2 + 50000 * 0.25;
        Assert.assertEquals(test4Verwacht,test4,0.0001);

        double test5 = AccountMethoden.berekenWinstBelasting(100001);
        double test5Verwacht = 50000 * 0.2 + 50000 * 0.25 + 1 * 0.3;
        Assert.assertEquals(test5Verwacht,test5,0.0001);

        double test6 = AccountMethoden.berekenWinstBelasting(100002);
        double test6Verwacht = 50000 * 0.2 + 50000 * 0.25 + 2 * 0.3;
        Assert.assertEquals(test6Verwacht,test6,0.0001);
    }


    @Test
    public void testDagloon()
    {
        double test1 = AccountMethoden.berekenDagloon(17, false, 0, false);
        Assert.assertEquals(40,test1, 0.0001);

        double test2 = AccountMethoden.berekenDagloon(17, true, 2, true);
        Assert.assertEquals(80,test2, 0.0001);

        double test3 = AccountMethoden.berekenDagloon(18, false, 2, true);
        Assert.assertEquals(80,test3, 0.0001);

        double test4 = AccountMethoden.berekenDagloon(18, true, 0, false);
        Assert.assertEquals(60,test4, 0.0001);

        double test5 = AccountMethoden.berekenDagloon(21, false, 2, false);
        Assert.assertEquals(70,test5, 0.0001);

        double test6 = AccountMethoden.berekenDagloon(21, true, 0, true);
        Assert.assertEquals(90,test6, 0.0001);
    }
}

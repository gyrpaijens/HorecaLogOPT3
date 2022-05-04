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

    @Test
    public void testLogin()
    {
        ArrayList<Account> accounts = new ArrayList<Account>();
        accounts.add(account);

        Account verwacht = account;
        Account actueel = AccountMethoden.logIn("test","test", accounts );

        Assert.assertEquals(verwacht, actueel);
    }

}

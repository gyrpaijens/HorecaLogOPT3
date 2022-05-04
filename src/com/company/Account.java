package com.company;

import java.util.ArrayList;

public class Account implements IAccount
{
    private String UserName;
    private String PassWord;
    private String Filiaal;
    public boolean ingelogd;

    public Account(String userName, String passWord, String Filiaal)
    {
        this.UserName = userName;
        this.PassWord = passWord;
        this.Filiaal = Filiaal;
    }

    @Override
    public String GetUserName() {
        return UserName;
    }

    @Override
    public String GetPassword() {
        return PassWord;
    }

    @Override
    public String GetFiliaal() {
        return Filiaal;
    }

}

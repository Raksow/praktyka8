package com.raksow;

public class BankC extends Bank
{
    int balance = 200;

    @Override
    public void getBalance()
    {
        System.out.println("Account balance = " +balance+ " USD");
    }
}

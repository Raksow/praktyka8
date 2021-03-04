package com.raksow;

public class BankA extends Bank
{
    int balance = 100;

    @Override
    public void getBalance()
    {
        System.out.println("Account balance = " +balance+ " USD");
    }
}

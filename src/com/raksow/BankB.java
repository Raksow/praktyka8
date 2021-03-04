package com.raksow;

public class BankB extends Bank
{
    int balance = 150;

    @Override
    public void getBalance()
    {
        System.out.println("Account balance = " +balance+ " USD");
    }
}

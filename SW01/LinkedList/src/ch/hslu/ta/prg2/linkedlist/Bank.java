/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ch.hslu.ta.prg2.linkedlist;

import java.util.ArrayList;

/**
 *
 * @author Daniel
 */
public class Bank
{
    private String name;
    private ArrayList<Konto> accountList;

    /**
     * 
     * @param name 
     */
    public Bank(String name)
    {
        this.name = name;
    }
    
    
    public void openKonto()
    {
        accountList.add(new Konto());
    }

    
    public void openKonto(double saldo, double rate)
    {
        accountList.add(new Konto(saldo, rate));
    }
    
    
    public void openSpar(double saldo, double rate, double maxOut)
    {
        accountList.add(new Spar(saldo, rate, maxOut));
    }
    
    
    public int noOfAccounts()
    {
        return accountList.size();
    }
    
    
    public void printAccounts()
    {
        for(Konto i:accountList)
        {
            i.print();
        }
    }
    
    
    public void printFund()
    {
        double fund = 0;
        for(Konto i:accountList)
        {
            fund += i.getSaldo();
        }
        System.out.println(fund);
    }
    
    /**
     * 
     * @param args 
     */
    public static void main(String[] args)
    {
        Bank myBank = new Bank("Meine Bank");
        myBank.openKonto(0, 0.02);
        myBank.openKonto(1000, 0.03);
        myBank.openSpar(10000, 0.05, 3000);
        myBank.openKonto(250, 0.15);
        System.out.println(myBank.noOfAccounts());
        myBank.printAccounts();
        myBank.printFund();
    }
}

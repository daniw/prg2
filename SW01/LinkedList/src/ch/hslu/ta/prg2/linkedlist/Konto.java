/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ch.hslu.ta.prg2.linkedlist;

/**
 *
 * @author Daniel
 */
public class Konto
{
    private static int count = 0;
    private int no;
    private double saldo;
    private double rate;
    
    /**
     * 
     */
    public Konto()
    {
        no = ++count;
        saldo = 0;
        rate = 0;
    }
    
    /**
     * 
     * @param saldo
     * @param rate 
     */
    public Konto(double saldo, double rate)
    {
        no = ++count;
        this.saldo = saldo;
        this.rate = rate;
    }

    /**
     * 
     * @return 
     */
    public static int getCount()
    {
        return count;
    }

    /**
     * 
     * @return 
     */
    public int getNo()
    {
        return no;
    }

    /**
     * 
     * @return 
     */
    public double getSaldo()
    {
        return saldo;
    }

    /**
     * 
     * @return 
     */
    public double getRate()
    {
        return rate;
    }

    /**
     * 
     * @param no 
     */
    public void setNo(int no)
    {
        this.no = no;
    }

    /**
     * 
     * @param saldo 
     */
    public void setSaldo(double saldo)
    {
        this.saldo = saldo;
    }

    /**
     * 
     * @param rate 
     */
    public void setRate(double rate)
    {
        this.rate = rate;
    }
    
    /**
     * 
     * @param ammount 
     */
    public void payIn(double ammount)
    {
        saldo += ammount;
    }
    
    /**
     * 
     * @param ammount 
     * @return  
     */
    public double payOut(double ammount)
    {
        saldo -= ammount;
        return ammount;
    }
    
    /**
     * 
     */
    public void print()
    {
        System.out.println("Nummer: " + no + "\nSaldo:  " + saldo + "\nZins:   " + rate);
    }
}

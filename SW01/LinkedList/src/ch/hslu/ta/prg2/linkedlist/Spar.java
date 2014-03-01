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
public class Spar extends Konto
{
    private double maxOut;
    
    /**
     * 
     * @param saldo
     * @param rate
     * @param maxOut 
     */
    public Spar(double saldo, double rate, double maxOut)
    {
        super();
        this.maxOut = maxOut;
    }
    
    /**
     * 
     * @param ammount
     * @return 
     */
    @Override
    public double payOut(double ammount)
    {
        if (super.getSaldo() >= ammount && maxOut >= ammount)
        {
            return super.payOut(ammount);
        }
        return 0;
    }
    
    /**
     * 
     */
    @Override
    public void print()
    {
        super.print();
        System.out.println("Limite: " + maxOut);
    }
    
    public static void main(String[] args)
    {
        Spar mySpar = new Spar(0, 0.02, 1000);
        mySpar.payIn(500);
        mySpar.print();
    }
}

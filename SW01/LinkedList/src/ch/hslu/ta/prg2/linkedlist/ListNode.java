/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ch.hslu.ta.prg2.linkedlist;

/**
 *
 * @author Daniel
 * @param <T>
 */
public class ListNode<T>
{
    private T konto;
    private ListNode<T> next;

    /**
     * 
     * @param next
     * @param konto 
     */
    public ListNode(ListNode<T> next, T konto)
    {
        this.next = next;
        this.konto = konto;
    }

    /**
     * 
     * @return 
     */
    public T getKonto()
    {
        return konto;
    }

    /**
     * 
     * @return 
     */
    public ListNode<T> getNext()
    {
        return next;
    }

    /**
     * 
     * @param konto 
     */
    public void setKonto(T konto)
    {
        this.konto = konto;
    }

    /**
     * 
     * @param next 
     */
    public void setNext(ListNode<T> next)
    {
        this.next = next;
    }
    
    @Override
    public boolean equals(Object o)
    {
        return konto.equals(o);
    }
}

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
public class LinkedList<T>
{
    private ListNode<T> head;
    
    /**
     * 
     */
    public LinkedList()
    {
        head = null;
    }
    
    /**
     * 
     * @param d
     * @return 
     */
    public boolean isFound(T d)
    { 
        ListNode<T> actualNode = head;
        while (actualNode != null)
        {
            if (actualNode.equals(d))
            {
                return true;
            }
        }
        return false;
    }
    
    /**
     * 
     * @param d 
     */
    public void insert(T d)
    {
        head = new ListNode<T>(head, d);
    }
    
    /**
     * 
     * @param d 
     */
    public void remove(T d)
    {
        ListNode<T> actualNode = head;
        ListNode<T> previousNode = null;
        
        while ((actualNode != null) && (!actualNode.equals(d)))
        {
            previousNode = actualNode;
            actualNode = actualNode.getNext();
        }
        
        // Check if List is not empty
        if (actualNode != null)
        {
            // Check if element to be removed at Start of List
            if (actualNode == head)
            {
                head = actualNode.getNext();
            }
            else
            {
                previousNode.setNext(actualNode.getNext());
            }
        }
    }
    
    /**
     * 
     */
    public void print()
    {
        ListNode<T> actualNode = head;
        while (actualNode != null)
        {
            actualNode.print();
        }
    }
    
    /**
     * 
     * @return 
     */
    public int length()
    {
        int count = 0;
        ListNode<T> actualNode = head;
        while (actualNode != null)
        {
            count++;
        }
        return count;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ch.hslu.ta.prg2;

import java.util.ArrayList;

/**
 *
 * @author Daniel
 */
public class Stack<T>
{
    private ArrayList<T> stack; 
    
    public Stack() 
    { 
        stack = new ArrayList<>(); 
    } 
    
    public void push(T o) 
    { 
        stack.add(o);
    } 
    
    public T pop() 
    { 
        if (!stack.isEmpty())
        {
            return stack.remove(0); 
        }
        return null;
    }
    
    public boolean isEmpty() 
    {
        return stack.isEmpty();
    }
    
    public boolean isFull() 
    {
        return false;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
    }
    
}

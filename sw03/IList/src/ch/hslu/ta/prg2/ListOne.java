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
public class ListOne implements IList
{
    ArrayList<Integer> list = new ArrayList<>();
    
    @Override
    public void add(Integer i)
    {
        list.add(i);
    }

    @Override
    public boolean remove(Integer i)
    {
        return list.remove(i);
    }

    @Override
    public boolean removeValue(int i)
    {
        for (Integer j:list)
        {
            if ((int) j == i)
            {
                return list.remove(j);
            }
        }
        return false;
    }

    @Override
    public boolean removeValues(int i)
    {
        boolean contained = false;
        for (Integer j:list)
        {
            if ((int) j == i)
            {
                contained = list.remove(j);
            }
        }
        return contained;
    }

    @Override
    public int size()
    {
        return list.size();
    }

    @Override
    public boolean exists(int i)
    {
        return list.contains((Integer) i);
    }

    @Override
    public void print()
    {
        for (Integer j:list)
        {
            System.out.println(j.toString());
        }
    }
    
}

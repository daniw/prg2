/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ch.hslu.ta.prg2.queuetest;

import java.util.ArrayDeque;

/**
 *
 * @author Daniel
 */
public class QueueTest
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        ArrayDeque<String> test;
        test = new ArrayDeque<>(17);
        test.add("1");
        test.add("2");
        test.add("3");
        test.add("4");
        test.add("5");
        test.add("6");
        test.add("7");
        test.add("8");
        test.add("9");
        test.add("10");
        test.add("11");
        test.add("12");
        test.add("13");
        test.add("14");
        test.add("15");
        
        while (!test.isEmpty())
        {
            System.out.println(test.remove());
        }
        System.out.println(test.size());
    }
    
}

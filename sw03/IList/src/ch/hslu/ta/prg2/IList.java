/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ch.hslu.ta.prg2;

/**
 *
 * @author Daniel
 */
public interface IList
{
    void add(Integer i);
    boolean remove(Integer i);
    boolean removeValue(int i);
    boolean removeValues(int i);
    int size();
    boolean exists(int i);
    void print();
}

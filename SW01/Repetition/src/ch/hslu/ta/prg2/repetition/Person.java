/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hslu.ta.prg2.repetition;

/**
 *
 * @author Daniel
 */
public class Person
{

    private String name;
    private String firstName;

    /**
     *
     */
    public Person()
    {
    }

    /**
     *
     * @param name
     * @param firstName
     */
    public Person(String name, String firstName)
    {
        this.name = name;
        this.firstName = firstName;
    }

    /**
     *
     * @return
     */
    public String getName()
    {
        return name;
    }

    /**
     *
     * @return
     */
    public String getFirstName()
    {
        return firstName;
    }

    /**
     *
     * @param name
     */
    public void setName(String name)
    {
        this.name = name;
    }

    /**
     *
     * @param firstName
     */
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    /**
     *
     */
    public void print()
    {
        System.out.println("Name: " + firstName + " " + name);
    }

}

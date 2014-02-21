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
public class Teacher extends Person
{
    private String subject;
    private int salary;

    public Teacher(String name, String firstName)
    {
        super(name, firstName);
    }

    public Teacher(String name, String firstName, String subject, int salary)
    {
        super(name, firstName);
        this.subject = subject;
        this.salary = salary;
    }

    public String getSubject()
    {
        return subject;
    }

    public int getSalary()
    {
        return salary;
    }

    public void setSubject(String subject)
    {
        this.subject = subject;
    }

    public void setSalary(int salary)
    {
        this.salary = salary;
    }

    @Override
    public void print()
    {
        super.print();
        System.out.println("subject: " + subject + "\n" + "salary: " + salary);
    }
    
    
}

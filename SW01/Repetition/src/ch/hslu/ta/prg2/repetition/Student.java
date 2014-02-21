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
public class Student extends Person
{

    private final int studentNumber;
    private String course;
    private static int number = 1000;

    public Student(String name, String firstName)
    {
        super(name, firstName);
        this.studentNumber = number++;
    }

    public Student(String name, String firstName, String course)
    {
        super(name, firstName);
        this.studentNumber = number++;
        this.course = course;
    }

    public int getStudentNumber()
    {
        return studentNumber;
    }

    public String getCourse()
    {
        return course;
    }

    public void setCourse(String course)
    {
        this.course = course;
    }

    @Override
    public void print()
    {
        System.out.println("Name: " + super.getFirstName() + " " 
                + super.getName() + "\n" + course + "\n" + studentNumber);
    }

}

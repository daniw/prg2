/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ch.hslu.ta.prg2.repetition;

import java.util.HashMap;

/**
 *
 * @author Daniel
 */
public class School
{
    
    private String name;
    private HashMap<Integer, Student> studentList;

    public School(String name)
    {
        this.name = name;
        this.studentList = new HashMap<>();
    }
    /**
     * Get the value of name
     *
     * @return the value of name
     */
    public String getName()
    {
        return name;
    }

    /**
     * 
     * @return studentList
     */
    public HashMap<Integer, Student> getStudentList()
    {
        return studentList;
    }
    
    /**
     * Set the value of name
     *
     * @param name new value of name
     */
    public void setName(String name)
    {
        this.name = name;
    }

    /**
     * 
     * @param studentList 
     */
    public void setStudentList(HashMap<Integer, Student> studentList)
    {
        this.studentList = studentList;
    }
    
    /**
     * 
     * @param name
     * @param firstname 
     */
    public void enrolStudent(String name, String firstname)
    {
        Student student;
        student = new Student(name, firstname);
        studentList.put(student.getStudentNumber(), student);
    }

    /**
     * 
     * @param name
     * @param firstname
     * @param course 
     */
    public void enrolStudent(String name, String firstname, String course)
    {
        Student student;
        student = new Student(name, firstname, course);
        studentList.put(student.getStudentNumber(), student);
    }
    
    public void printStudent()
    {
        for(Integer iterator:studentList.keySet())
        {
            studentList.get(iterator).print();
        }
    }
}

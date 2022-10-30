package week5.tute;

import java.util.Arrays;

public class Student implements Printable
{
    private String name;
    private String[] grades;

    public Student(String name, String[] grades)
    {
        this.name = name;
        this.grades = grades;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String[] getGrades()
    {
        return grades;
    }

    public void setGrades(String[] grades)
    {
        this.grades = grades;
    }

    @Override
    public void print()
    {
        System.out.println("Name: " + name + "\nGrades: " + Arrays.toString(grades));
    }
}

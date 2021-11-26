package model;

public class Student{
    private int age;
    private int id;
    private String name;

    public Student(int age , int id , String name)
    {
        this.age = age;
        this.id = id;
        this.name = new String(name);
    }

    public void setAge(int newAge)
    {
        this.age = newAge;
    }

    public int getAge()
    {
        return this.age;
    }

    public void setId(int newId)
    {
        this.id = newId;
    }

    public int getId()
    {
        return this.id;
    }

    public void setName(String newName)
    {
        this.name = new String(newName);
    }

    public String getName()
    {
        return this.name;
    }
}

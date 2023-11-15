package com.example.electronicsstore2;

public abstract class Person {
    protected String name;
    protected String gender;
    protected String age;
    public Person(String name,String gender, String age)
    {
        this.age=age;
        this.gender=gender;
        this.name=name;

    }
    public Person(){}
    abstract String GetData();

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getAge() {
        return age;
    }
}

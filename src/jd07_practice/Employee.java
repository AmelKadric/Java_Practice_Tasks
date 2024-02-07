package jd07_practice;

public class Employee {

    public String name;
    public int age;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }

    public char gender;
    public String jobTitle;
    public double salary;

    public void work(){
        System.out.println(name + " is working.");
    }



}

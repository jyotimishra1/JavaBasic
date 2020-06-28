package comparable;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import compartor.Employee;
//Comparable Example to short the emaployee data (ComparableClass=Employee)
public class ComparableClass implements Comparable<ComparableClass> {

    private int id;
    private String name;
    private int age;
    private long salary;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public long getSalary() {
        return salary;
    }

    public ComparableClass(int id, String name, int age, int salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public int compareTo(ComparableClass emp) {
        //let's sort the employee based on id in ascending order
        //returns a negative integer, zero, or a positive integer as this employee id
        //is less than, equal to, or greater than the specified object.
        return (this.id - emp.id);
    }

    @Override
    //this is required to print the user friendly information about the Employee
    public String toString() {
        return "[id=" + this.id + ", name=" + this.name + ", age=" + this.age + ", salary=" +
                this.salary + "]";
    }
public static void main(String[] args)
{	ArrayList<ComparableClass> ls=new ArrayList<ComparableClass>();
ComparableClass e1=new ComparableClass(10, "Jyoti", 26, 60);ls.add(e1);
ComparableClass e2=new ComparableClass(11, "Jyoti1", 24, 30);ls.add(e2);
ComparableClass e3=new ComparableClass(3, "Jyoti3", 28, 70);ls.add(e3);
ComparableClass e4=new ComparableClass(5, "Jyoti6", 22, 30);ls.add(e4);
	Collections.sort(ls);
	System.out.println(ls);
	//int i[]=new int[10];
	//String s[]=new String[3];
	ComparableClass a[]=new ComparableClass[2];
	a[0]=new ComparableClass(10, "Jyoti", 26, 60);
	a[1]=new ComparableClass(5, "Jyoti6", 22, 30);
	Arrays.sort(a);
	System.out.println(Arrays.toString(a));
}
}
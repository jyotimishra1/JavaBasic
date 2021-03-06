package collection.map;

//Comparable Example to short the emaployee data (ComparatorClass=Employee)
public class Employee11{

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

    public Employee11(int id, String name, int age, int salary) {

        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    //this is required to print the user friendly information about the Employee
    public String toString() {
        return "[id=" + this.id + ", name=" + this.name + ", age=" + this.age + ", salary=" +
                this.salary + "]";

    }
    @Override
   public int hashCode()
    {
        return this.id;
    }

    @Override
    public boolean equals(Object e) {
       if (e == null) {
           return false;
       }
       Employee11 e2 = (Employee11) e;
       return (this.id == e2.id && this.name.equals(e2.name));
   }

    /*@Override
    public int compareTo(Object o) {
        Employee11 e2=(Employee11)o;
        return this.id-e2.id;
    }*/
}
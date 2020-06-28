package comparable;

import java.util.ArrayList;
import java.util.Collections;

public class Employee implements Comparable<Employee>{
    int id; String name;
    Employee(int id,String name){
        this.id=id;
        this.name=name;
    }

    @Override
    //by name shorting
    public int compareTo(Employee emp) {
        return this.name.compareTo(emp.name);

    }
    /*@Override
    //compare by id
    public int compareTo(Employee emp) {
        return this.id-emp.id;

    }*/
    public static void main(String[] args) {
        ArrayList<Employee> elist=new ArrayList<>();
        elist.add(new Employee(11,"Jyoti"));
        elist.add(new Employee(6,"Jyoti1"));
        elist.add(new Employee(7,"Jyoti2"));
        Collections.sort(elist);
        for (Employee e:elist)
        {
            System.out.print(e.id +",");
            System.out.println(e.name);
        }
    }
}

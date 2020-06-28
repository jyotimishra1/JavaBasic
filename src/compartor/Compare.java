package compartor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Compare implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getId()-o2.getId();
    }

    public static void main(String[] args) {
        ArrayList l=new ArrayList();
        Employee e=new Employee(3,"Jyoti",54,87);l.add(e);
        Employee e1=new Employee(13,"Jyoti1",524,787);l.add(e1);
        Employee e2=new Employee(30,"Jyoti2",154,187);l.add(e2);
        Employee e3=new Employee(2,"Jyoti",514,82);l.add(e3);
        Employee e4=new Employee(2,"Jyoti3",5134,832);l.add(e4);
        System.out.println("sort by id");
        Collections.sort(l, new Compare());
        l.forEach(a->{System.out.println(a);});
        System.out.println("sort by name");
        Collections.sort(l, new CompareByname());
        l.forEach(a->{System.out.println(a);});
        System.out.println("sort by salary");
        Collections.sort(l, new CompareBysalary());
        l.forEach(a->{System.out.println(a);});
        System.out.println("sort by id and name");
        Collections.sort(l, new CompareByIdAndName());
        l.forEach(a->{System.out.println(a);});
    }
}
class CompareByname implements Comparator<Employee>{

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
class CompareBysalary implements Comparator<Employee>{

    @Override
    public int compare(Employee o1, Employee o2) {
        return (int)(o1.getSalary()-o2.getSalary());
    }
}
class CompareByIdAndName implements Comparator<Employee>{

    @Override
    public int compare(Employee o1, Employee o2) {
        int flag=o1.getId()-o2.getId();
        if(flag==0)
        {
            return o1.getName().compareTo(o2.getName());
        }
        else return flag;
    }
}
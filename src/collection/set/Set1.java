package collection.set;

import java.util.HashSet;
import java.util.Set;

import collection.map.Address;
import collection.map.Employee;

public class Set1 {

	public static void main(String[] args) {
		Set<Employee> set=new HashSet<Employee>();
		Employee e=new Employee(1, "j1", new Address("11", "B1"));
		Employee e1=new Employee(2, "j2", new Address("22", "B2"));
		Employee e2=new Employee(2, "j2", new Address("22", "B2"));
		Employee e3=new Employee(2, "j2", new Address("44", "B44"));
		set.add(e);
		set.add(e1);
		set.add(e2);
		set.add(e3);
		for(Employee emp:set)
		{
			System.out.println(emp);
			//descending order of hash value 
			System.out.println(emp.hashCode());
		}
	}

}

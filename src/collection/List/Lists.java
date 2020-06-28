package collection.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lists {

	public static void main(String[] args) {
		Employee e0=new Employee(2, "z", new Address("3", "b1"));
		Employee e1=new Employee(2, "b", new Address("3", "b1"));
		Employee e2=new Employee(4, "nameAtFirst", new Address("3", "b3"));
		Employee e3=new Employee(2, "a", new Address("3", "b2"));
		Employee e4=new Employee(1, "d", new Address("3", "b3"));
		List<Employee> s=new ArrayList<Employee>();
		s.add(e0);
		s.add(e1);
		s.add(e2);
		s.add(e3);
		s.add(e4);
		Collections.sort(s,new SortByName("nameAtFirst"));
		s.forEach(e-> System.out.println(e.getName()+","+e.getId()));




		//s=s.stream().sorted(Comparator.comparing(Employee::getName).thenComparing(Employee::getId)).collect(Collectors.toList());
		//s=s.stream().sorted(Comparator.comparing(Employee::getName).thenComparing(Employee::getId)).collect(Collectors.toList());

		/*//System.out.println(s.get(2).getAdd().getStreet());
	*//*	Iterator i=s.iterator();
		int i1=0;
		while(i.hasNext())
		{
			Employee emp=(Employee) i.next();
			System.out.println("Employee detail :" );
			System.out.println(emp.getName()+", "+emp.getId()+","+emp.getAdd().getPincode());
			i1++;
			
		}*//*
		for (Employee emp : s) {
			System.out.println(emp.getName()+", "+emp.getId()+","+emp.getAdd().getPincode());
		}
		*//*for(int i2 = 0;i2<s.size();i2++)
		{
			Employee emp=s.get(i2);
			
			System.out.println(emp.getName()+", "+emp.getId()+","+emp.getAdd().getPincode());
		}*//*
		
		ArrayList a=new ArrayList();
		a.add("3");
		a.add(1);
		Iterator it=a.iterator();
		*//*while(it.hasNext())
		{
			System.out.println(it.next());
		}*//*
		*//*for(Object i:a)
		{
			System.out.println(i);
		}*//*
		//single line in foreach
		//a.forEach(u->System.out.println("lamda expression value of list " +u));
		//multiple lines in foreach
		*//*a.forEach(e->{
			System.out.println("lamda expression WITH MULTIPLE LINE");
			System.out.println("lamda expression value of list " +e);
		}
				
				
				);*//*
		
		//iterating by passing by method reference
		System.out.println("iterating by passing by method reference");
		a.forEach(System.out::println);  */
	}
}

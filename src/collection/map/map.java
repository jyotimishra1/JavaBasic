package collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class map {

	public static void main(String[] args) {
		Employee e=new Employee(1, "j1", new Address("11", "B1"));
		Employee e1=new Employee(2, "j2", new Address("22", "B2"));
		Employee e2=new Employee(2, "j2", new Address("22", "B2"));
		//System.out.println(e);
		Map<Employee, Integer> map=new HashMap<Employee, Integer>();
		map.put(e,1);
		map.put(e1, 2);
		System.out.println(map.put(e2, 2));
		System.out.println(map);
		System.out.println(map.get(e));
/*		for(Employee emp:map.keySet())
		{
			System.out.println("Employee object value: "+emp);
			System.out.println("Key value: "+map.get(emp));
		}*/
		/*for(Map.Entry<Employee, Integer> emp:map.entrySet())
		{
			System.out.println("Employee object value: "+emp.getKey());
			System.out.println("Key value: "+emp.getValue());
		}*/
	}

}

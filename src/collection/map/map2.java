package collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class map2 {

	public static void main(String[] args) {
		Map<String,Integer> m=new HashMap<String,Integer>();
		m.put("ram", 0);
		m.put("ram1", 1);
		m.put("ram1", 2);
		m.put("ram", 10);
		/*for(String i:m.keySet())
		{
			System.out.println("Key :" +i+ " value: " +m.get(i));
		}*/
		/*for(Map.Entry<String, Integer> entry:m.entrySet())
		{
			System.out.println("Key :" +entry.getKey()+ " value: " +entry.getValue());
		}*/
		//java 8 lamda expression
		m.forEach((k,v)->System.out.println("Key : " + k + " Value : " + v));

	}

}

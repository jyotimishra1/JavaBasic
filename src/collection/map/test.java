package collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class test {
 public static void main(String arh[])
 {
	 Map<Integer,String> map=new HashMap<Integer,String>();
	 map.put(1, "a");
	 map.put(2, "b");
	 int j=1;

	 for(Integer i:map.keySet())	
	 {
		System.out.println(j+" key "+i); 
		System.out.println(j+" Value "+map.get(i));
	 }
	 System.out.println("============using Map.Entry<Inteer,String>===============");
	 for(Map.Entry<Integer,String> entry:map.entrySet())
	 {
		 System.out.println("key "+entry.getKey());
		 System.out.println("Value "+entry.getValue());
	 }
	 System.out.println("============map.keySet().Iterator()===============");
	 Iterator it=map.keySet().iterator();
	 while(it.hasNext())
	 {
		 Integer key=(Integer) it.next();
		 System.out.println("key "+key);
		 System.out.println("value "+map.get(key));
		 
	 }
	 
 }
}

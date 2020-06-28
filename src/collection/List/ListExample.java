package collection.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExample {
	public static void main(String[] args) {
		List<String> l=new ArrayList<>();
		l.add("3");
		l.add("4");
		l.add("5");
		l.set(0, "ii");
	Iterator<String> it=l.iterator();
	/*while(it.hasNext())
	{
		String s=it.next();
		System.out.println(s);
		it.remove();
	}*/
	//for loop 
/*	for (int i = 0; i < l.size(); i++) {
		System.out.println(l.get(i));
	}*/
	for (String string : l) {
		System.out.println(string);
	}
	}
}

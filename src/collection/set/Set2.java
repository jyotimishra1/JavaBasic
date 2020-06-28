package collection.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import collection.map.Address;
import collection.map.Employee;

public class Set2 {

	public static void main(String[] args) {
		Set<Integer> a = new HashSet<Integer>();
        a.addAll(Arrays.asList(new Integer[] {1,2,3}));
        Set<Integer> b = new HashSet<Integer>();
        b.addAll(Arrays.asList(new Integer[] {1,3,4,5}));
 
        // To find union
        Set<Integer> union = new HashSet<Integer>(a);
        union.addAll(b);
        System.out.print("Union of the two Set");
        System.out.println(union);
 
        // To find intersection
        Set<Integer> intersection = new HashSet<Integer>(a);
        intersection.retainAll(b);
        System.out.print("Intersection of the two Set");
        System.out.println(intersection);
 
        // To find the symmetric difference
        Set<Integer> difference = new HashSet<Integer>(a);
        difference.removeAll(b);
        System.out.print("Difference of the two Set");
        System.out.println(difference);
	}

}

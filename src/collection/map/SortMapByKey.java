package collection.map;

import java.util.*;

public class SortMapByKey {
    public static void main(String[] args) {
        HashMap<Employee1,Integer> map=new HashMap<>();
        Employee1 e=new Employee1(3,"Jyoti",54,87);map.put(e,3);
        Employee1 e1=new Employee1(33,"Jyoti1",534,87);map.put(e1,2);
        Employee1 e2=new Employee1(2,"Jyoti2",4,87);map.put(e2,30);
        Employee1 e3=new Employee1(22,"Jyoti2",4,87);map.put(e3,33);
       Set s=map.keySet();
        ArrayList l=new ArrayList(s);
        Collections.sort(l);
        l.forEach(a->{
            System.out.println(a);
            System.out.println(map.get(a));
        });

    }

}

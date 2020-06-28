package collection.map;

import java.util.*;

public class SortMapByValue {
    public static void main(String[] args) {
        HashMap<Employee11,Integer> map=new HashMap<>();
        Employee11 e=new Employee11(3,"Jyoti",54,87);map.put(e,3);
        Employee11 e1=new Employee11(33,"Jyoti1",534,87);map.put(e1,2);
        Employee11 e2=new Employee11(2,"Jyoti2",4,87);map.put(e2,30);
        Employee11 e3=new Employee11(22,"Jyoti2",4,87);map.put(e3,33);
       Set<Map.Entry<Employee11,Integer>> s=map.entrySet();
        List<Map.Entry<Employee11,Integer>> list = new ArrayList<Map.Entry<Employee11,Integer>>(s);
        //or create a class which implements Map.Entry<Employee11, Integer> o1, Map.Entry<Employee11, Integer>
        Collections.sort(list, new Comparator<Map.Entry<Employee11, Integer>>() {
            @Override
            public int compare(Map.Entry<Employee11, Integer> o1, Map.Entry<Employee11, Integer> o2) {
                return o1.getValue()-o2.getValue();
            }
        });
        for (Map.Entry<Employee11,Integer> entr:list){
            System.out.print(entr.getValue()+"= ");
            System.out.println(entr.getKey());
        }
    }

}

package Java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeSorting {
    public static void main(String[] args) {
        Employee e1 = new Employee("a", 4, 23);
        Employee e2 = new Employee("ba", 6, 12);
        Employee e3 = new Employee("a", 8, 11);
        Employee e4 = new Employee("a", 8, 13);
        List<Employee> l = new ArrayList();
        Collections.addAll(l, e1, e2, e3, e4);
        //sort by steam
        List<Employee> sl1 = l.stream().sorted(Comparator.comparing(Employee::getName).thenComparing(Employee::getAge).reversed()).collect(Collectors.toList());
        sl1.forEach(s ->
                System.out.println(s));
        //sort by collects util method
       l.sort(Comparator.comparing(Employee::getName).thenComparing(Employee::getAge).reversed());

    }
}

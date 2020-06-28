package collection.List;

import java.util.Comparator;

public class SortByName implements Comparator<Employee> {
    String nameAtFirst;

    SortByName(String nameAtFirst)
    {
        this.nameAtFirst=nameAtFirst;
    }
    @Override
    public int compare(Employee o1, Employee o2) {
        if(o1.getName().equals(this.nameAtFirst))
            return -1;
        else
        return 0;
    }
}

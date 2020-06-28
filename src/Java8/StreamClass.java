package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamClass {
    public static void main(String[] args) {
        List name= Arrays.asList("ada","acb","aa");
        List sorted = (List) name.stream().sorted().collect(Collectors.toList());
        sorted.forEach(n-> System.out.println(n));
    }
}

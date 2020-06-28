import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test123 {
    public static void main(String[] args) {
        Stream<Integer> numStream = Stream.of(1,2,3,3);
        Set lt1 = numStream.map(n-> n+1).collect(Collectors.toSet());
        numStream.forEach(System.out::print);

    }

}

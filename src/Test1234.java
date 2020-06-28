import java.time.LocalDate;
import java.time.MonthDay;
import java.time.Period;
import java.time.Year;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test1234 extends Thread implements Runnable{
    public static void main(String[] args) {
        //Stream<Integer> n1 = Stream.of(10, 20, 70);
        // n1.map(n -> n+10).peek(s -> System.out.print(s+" ")).count();
        //System.out.print(n1.map(n -> n+10).peek(s -> System.out.print(s+" ")).count());
        /*List<Integer> l=new ArrayList<>();
        l.add(10);l.add(30);l.add(40);
        l.stream().map(Test1234 ::devide).forEach(System.out :: println);
        System.out.println(l);*/
       /* Period p=Period.ofMonths(14);
        System.out.println(p.normalized());
*/

       /*String s=String.join("-",("a","b"));
        String s=String.join("-",List.of("a","b"));
        System.out.println(s);*/
       /* Year y= Year.of(2019);;
        LocalDate day=y.atMonthDay(MonthDay.of(4,31));
        System.out.println(day);*/


    }

}


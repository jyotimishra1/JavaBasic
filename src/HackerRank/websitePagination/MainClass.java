package HackerRank.websitePagination;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MainClass {
    public static void main(String[] args) {
        List<Item> itemList=new ArrayList<>();
        itemList.add(new Item("jypti", 3));
        itemList.add(new Item("ajit", 4));
        itemList.add(new Item("sheelu", 6));
        itemList.add(new Item("df", 8));
        itemList.add(new Item("87", 7));
        //2
        //1
        int divideByLimit=3;
        int pageNumber=1;
        int totalNoOfPage=divideByLimit*pageNumber-divideByLimit;
        System.out.println(itemList.stream().map(Item::getA).distinct().skip(totalNoOfPage).limit(divideByLimit).collect(Collectors.toList()));

        System.out.println(totalNoOfPage);
    }
}

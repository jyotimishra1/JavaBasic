package basics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StringHirarchy {
    public static void main(String[] args) {
        String s = "{Money Heist Info{The most important character is the Professor}{Another character is that of Berlin{Berlin is in charge of the money heist}} {Another character is that of Moscow{ Moscow is Denver's dad}}{Another character is that of Rio{Rio is a programmer{ Rio is also a decent hacker{ Rio is quite happy to be a part of the heist}}}}{ Another character is that of Denver}}";
        int openingBrac = 1;
        int print = 0;
        int startingIndex = 0;
        int closingIndex = 0;
        int firstlevel=0;
        Map<Integer, List<String>> levelmap = new HashMap<>();
        for (int i = 0; i < s.length()-1; i++) {
            List levelList;
            char a = s.charAt(i);
            if (a == '{' || a == '}') {
                print++;
                if (a == '}') {
                    openingBrac--;
                }
                if (print == 1) {
                    startingIndex = i+1 ;
                }
                if (print == 2) {
                    closingIndex = i-1;
                }
                if (print == 2) {
                    String atlevel = s.substring(startingIndex, closingIndex);
                    if (levelmap.containsKey(openingBrac)) {
                        levelList = levelmap.get(openingBrac);
                    } else {
                        levelList = new ArrayList();
                    }
                    levelList.add(atlevel);
                    levelmap.put(openingBrac, levelList);
                    print = 0;
                    openingBrac++;
                }
            }
        }
        levelmap.forEach((k, v) -> {
            System.out.println(k + ": " + v);

        });
    }
}

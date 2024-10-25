package assignment;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//1.Use lambda expressions to sort a list of integers in descending order
public class Problem1 {
    public static void main(String[] args) {
        
        List<Integer> list = Arrays.asList(40,30,100,10,90);

        Collections.sort(list,(P1,P2)->{
            return P2.compareTo(P1);
        });

        list.forEach((n)->{
            System.out.println(n);
        });
    }
}

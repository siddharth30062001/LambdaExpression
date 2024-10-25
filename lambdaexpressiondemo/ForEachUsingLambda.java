package lambdaexpressiondemo;

import java.util.*;

public class ForEachUsingLambda {

    public static void main(String[] args) {
        
        List<String> list=new ArrayList<>();
        list.add("apple");
        list.add("mango");
        list.add("orange");
        list.add("banana");

        list.forEach(
            (n)->System.out.println(n)
            );
    }
    
}

package assignment;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;


//4.Implement a lambda expression to concatenate a list of strings with a comma separator

public class Concatenate {

    public static void main(String[] args) {
        
        List<String> list=Arrays.asList("sid","raj","apple");

        String result=list.stream().collect(Collectors.joining(","));

        System.out.println(result);

    }
    
}

package assignment;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

//3. Create a lambda expression to find the maximum value in a list of integers.

public class Maximum {

    public static void main(String[] args) {
        
        List<Integer> numlist = Arrays.asList(30,12,100,5,8,50);

        Optional<Integer> result = numlist.stream().max(Integer :: compareTo);

        System.out.println("Maximum: "+result);
    }
    
}

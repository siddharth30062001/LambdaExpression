package assignment;

import java.util.Arrays;
import java.util.List;

//5. Use lambda expressions to map a list of integers to their squares.

public class IntegerSquares {

    public static void main(String[] args) {
        
        List<Integer> list = Arrays.asList(2,3,9,1);

        list.stream().map((n)->n*n)
        .forEach((s)->{
            System.out.println(s);
        });
    }
    
}

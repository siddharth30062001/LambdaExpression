package assignment;

import java.nio.file.DirectoryStream.Filter;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

//2. Use a lambda expression to filter a list of strings to include only those that are
//non-empty.

public class LambdaExpressionFilter {

    public static void main(String[] args) {
        
        List<String> list = Arrays.asList("sid",""," ","S","cat","Do g","");

        List<String> nonemptyStrings=list.stream().filter((s)->!s.trim().isEmpty())
        .collect(Collectors.toList());

        System.out.println(nonemptyStrings);

            
    
}
}

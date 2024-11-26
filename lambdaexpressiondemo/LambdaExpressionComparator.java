package lambdaexpressiondemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student{
    String id;
    String name;

    Student(String id, String name){
        this.id = id;
        this.name = name;
    }
}
public class LambdaExpressionComparator {

    public static void main(String[] args) {

        List<Student> list=new ArrayList<>();
        list.add(new Student("S101", "Amit"));
        list.add(new Student("S103", "Sumit"));
        list.add(new Student("S102", "Rahul"));
        list.add(new Student("S105", "Amit"));

        //iterating data in descending order of id
        Collections.sort(list,(P1,P2)->{
            return P2.id.compareTo(P1.id);
        });

        //iterating  without using lambda Expression
        for(Student s:list){
        System.out.println(s.id+" "+s.name);
        }

        System.out.println("*******************");

        //iterating using lambda Epression
        list.forEach((n)->{
            System.out.println(n.id+" "+n.name);
        });

        
    }
    
}

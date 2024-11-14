package lambdaexpressiondemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student{
    String ID;
    String name;

    Student(String ID, String name){
        this.ID = ID;
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

        Collections.sort(list,(P1,P2)->{
            return P2.ID.compareTo(P1.ID);
        });

        //iterating  without using lambda Expression
        for(Student s:list){
        System.out.println(s.ID+" "+s.name);
        }

        System.out.println("*******************");

        //iterating using lambda Epression
        
        list.forEach((n)->{
            System.out.println(n.ID+" "+n.name);
        });

        
    }
    
}

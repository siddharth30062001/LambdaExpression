package lambdaexpressiondemo;


interface Print{
    String display();
}
public class MultipleStatement {
    
    public static void main(String[] args) {
        Print p=()->{
            String st1="Hello ";
            String st2=st1 +"Siddharth";

            return st2;
        };
        System.out.println(p.display());
    }
}

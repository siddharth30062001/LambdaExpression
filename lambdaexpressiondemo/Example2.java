package lambdaexpressiondemo;


@FunctionalInterface
interface Addable{
    public int add(int a,int b);
}

@FunctionalInterface
interface Multiplication{
    public int mul(int a, int b);
}

public class Example2 {
    public static void main(String[] args) {
        
        //lambda Expression without using return type
        Addable d=(a,b)->(a+b);
        System.out.println(d.add(10, 15));

        Addable d2=(a,b)->(a+b);
        System.out.println(d2.add(5, 5));

        Addable d3=(a,b)->{
            return a+b;
        };
        System.out.println(d3.add(1, 1));

        Multiplication m=(a,b)->(a*b);
        System.out.println(m.mul(5, 10));

    }
}

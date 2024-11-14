package lambdaexpressiondemo;


@FunctionalInterface
interface Addable{
    public int add(int a,int b);
}

@FunctionalInterface
interface Multiplication{
    public int mul(int a, int b);
}

public class Operations {
    public static void main(String[] args) {
        
        //lambda Expression without using return type
        
        Addable object1=(a,b)->(a+b);
        System.out.println(object1.add(10, 15));

        Addable object2=(a,b)->(a+b);
        System.out.println(object2.add(5, 5));

        Addable object3=(a,b)->{
            return a+b;
        };
        System.out.println(object3.add(1, 1));

        Multiplication m=(a,b)->(a*b);
        System.out.println(m.mul(5, 10));

    }
}

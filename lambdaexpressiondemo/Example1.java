package lambdaexpressiondemo;

@FunctionalInterface
interface Display{

    public void displayData();
}

public class Example1 {

    public static void main(String[] args) {
        
        //using lambda Expression
        Display d=()->{
            System.out.println("Hello Siddharth");
        };
        d.displayData();

        //without using lambda Expression
        Display d1=new Display() {

            @Override
            public void displayData() {
                System.out.println("I am learning lambda Expression");
               
                
            }  
            
        };
        d1.displayData();
    }
    
}

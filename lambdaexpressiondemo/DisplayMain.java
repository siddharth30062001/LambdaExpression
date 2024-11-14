package lambdaexpressiondemo;

@FunctionalInterface
interface Display{

    public void displayData();
}

public class DisplayMain {

    public static void main(String[] args) {
        
        //using lambda Expression
        Display display=()->{
            System.out.println("Hello Siddharth");
        };
        display.displayData();

        //without using lambda Expression
        Display object=new Display() {

            @Override
            public void displayData() {
                System.out.println("I am learning lambda Expression");
               
                
            }  
            
        };
        object.displayData();
    }
    
}

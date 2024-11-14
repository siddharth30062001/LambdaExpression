package lambdaexpressiondemo;


interface Demo {

    void display(String name);
}
public class LambdaExpressionExample1 {

    public static void main(String[] args) {

        //code without lambda Expression

    //      Demo d=new Demo(){
        
    //     public void display(){
    //         System.out.println("Hello");
    //     }
    // };

    //----------------------------------------------//
    
    //code with using lambda Expression

    Demo data=(name)->{
        System.out.println("hiii "+name);
    };
    data.display("Siddharth");
    
    
}
}
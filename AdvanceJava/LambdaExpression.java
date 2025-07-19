package AdvanceJava;

@FunctionalInterface
interface A{
    void show(int i);
}


public class LambdaExpression {
    public static void main(String[] args) {
        A obj = i -> System.out.println("in show" + i); // Lambda
            
        obj.show(5);
    }
}

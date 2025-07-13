
class Calculator {
    
    public int add(int a, int b, int c) {
        return a+b+c;
    }

    public int add(int a, int b){
        return a+b;
    }

    public double add(double a, int b){
        return a+b;
    }
}


public class Class {
    public static void main(String a[]) {
   

        Calculator cal = new Calculator();

        double res = cal.add(4, 5);

        System.out.println(res);

    }
}
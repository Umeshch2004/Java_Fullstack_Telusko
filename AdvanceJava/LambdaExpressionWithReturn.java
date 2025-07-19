package AdvanceJava;

@FunctionalInterface
interface A{
    int add(int i, int j);
}


public class LambdaExpressionWithReturn {
    public static void main(String[] args) {
        A obj = (i, j) -> i+j;
            

        int res = obj.add(5,3);
        System.out.println(res);
    }
}

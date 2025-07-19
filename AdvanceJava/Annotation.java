package AdvanceJava;

class A{
    public void showA()
    {
        System.out.println("in A show");
    }
}

class B extends A
{
    @Override //Annotation
    public void showA()
    {
        System.out.println("in B show");
    }
}

public class Annotation {
    public static void main(String[] args) {
        B obj = new B();
        obj.showA();
    }
    
}

package AdvanceJava;

class A{
    public void show()
    {
        System.out.println("in A Show");
    }
}

class B extends A{
    public void show()
    {
        System.out.println("in B Show");
    }
}
public class AnonymousInnerClass {
    public static void main(String[] args) {
        A obj = new A()
        {
            public void show()
    {
        System.out.println("in new Show");
    }
        };
        obj.show();
    }
}

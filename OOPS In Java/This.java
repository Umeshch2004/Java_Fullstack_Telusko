class A extends Object // object will be called by default, if we mention it.
{
    public A()
    {
        super(); //it's there already (default);
        System.err.println("in A");
    }

    public A(int n)
    {   super(); //it's there already (default);
        System.out.println("in a int");
    }
}

class B extends A
{
    public B()
    {
        super(); //it's there already (default);
        System.err.println("in B");
    }

    public B(int n)
    {   
        this();
        // super(n); //it's there already (default);
        System.out.println("in b int");
    }
}

public class This {
    public static void main(String[] args) {
        B obj1 = new B();
        B obj = new B(5);
    }
}

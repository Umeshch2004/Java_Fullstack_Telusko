package AdvanceJava;

// class - class -> extends
// class - interface -> implements
// interface - interface -> extends

interface A{

    int age=44; // final and static(by default)
    String area = "Hyd";

    void show();
    void config();
}

interface X
{
    void run();
}

interface Y extends X
{
    
}

class B implements A,Y {
    public void show()
    {
        System.out.println("in show");
    }

    public void config()
    {
        System.out.println("in config");
    }

    public void run()
    {
        System.out.println("Running");
    }
}


public class Interface {
    public static void main(String[] args) {
        A obj;
        obj = new B();
        obj.show();
        obj.config();

        X obj1 = new B();
        obj1.run();


        System.out.println(A.area);
    }
}

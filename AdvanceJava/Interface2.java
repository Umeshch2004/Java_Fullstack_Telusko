
package AdvanceJava;

// abstract class Computer
// {
//     abstract public void code();
// }

interface Computer
{
    void code();
}

class Laptop implements Computer
{
    public void code()
    {
        System.out.println("code, compile, run");
    }
}

class Desktop implements Computer
{
    public void code()
    {
        System.out.println("code, compile, run");
    }
}

class Developer
{
    public void devApp(Computer lap)
    {
        lap.code();
    }
}


public class Interface2 {
    public static void main(String[] args) {
        Computer lap = new Laptop();
        Computer desk = new Desktop();

        Developer umesh = new Developer();
        umesh.devApp(desk);
    }
}

//final - variable, method, class

class Calc{
    public final void show()
    {
        System.out.println("in Calc Show");
    }

    public void add(int a, int b)
    {
        System.out.println(a+b);
    }
}

class AdvCalc extends Calc
{
    public void show()
    {
        System.out.println("by Umes");
    }
}

public class finalKeyword {
    public static void main(String[] args) {
        Calc obj = new Calc();
        obj.show();
        obj.add(5, 03);
    }
}

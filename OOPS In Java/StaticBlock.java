
class Mobile {
    String brand;
    int price;
    static String name;

    static 
    {
        name = "Mobile";
        System.err.println("in static block");
    }

    public Mobile()
    {
        brand = "";
        price = 200;
        System.out.println("in constructor");
    }

    public void show()
    {
        System.out.println(brand + " " + price + " " + name);
    }

    public static void show1(Mobile obj) {
        System.err.println(obj.brand + " " + obj.price + " " + name);
    }
}


public class StaticBlock{
    public static void main(String[] args) {
        Class.forName("Mobile");
    }
}
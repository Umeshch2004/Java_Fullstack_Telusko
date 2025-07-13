
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


public class StaticMethods{
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.brand = "Samsung";
        obj1.price = 1500;
        Mobile.name = "SmartPhone";

        Mobile obj2 = new Mobile();
        obj2.brand = "Iphone";
        obj2.price = 1500;
        Mobile.name = "Phone";

        obj1.show();
        obj2.show();

        Mobile.show1(obj1);
    }
}
class Mobile{
    String brand;
    int price;
    // String name;
    static String name;

    public void show()
    {
        System.err.println(brand + " " + price + " " + name);
    }
}

public class StaticVariable
{
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.brand = "Samsung";
        obj1.price = 1500;
        // obj1.name = "SmartPhone";
        Mobile.name = "Phone";

        Mobile obj2 = new Mobile();
        obj2.brand = "Iphone";
        obj2.price = 1500;
        // obj2.name = "SmartPhone";
        Mobile.name = "Phone";

        obj1.show();
        obj2.show();


    }
}
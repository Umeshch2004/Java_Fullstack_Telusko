package AdvanceJava;


enum Laptop{
    Macbook(2000), Dell(1200) ,Xioami, ThinkPad(1000);

    private int price;

    

    private Laptop() { // default constructor
        price = 1400;
    }

    private Laptop(int price)
    {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    
}

public class EnumClass {
    // Laptop lap = Laptop.Dell;
    // System.out.println(lap + ":" + lap.getPrice());

    public static void main(String[] args) {
        for(Laptop lap : Laptop.values())
    {
        System.out.println(lap + " : " + lap.getPrice());
    }
    }
}

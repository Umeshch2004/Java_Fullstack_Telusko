package AdvanceJava;

abstract class Car
{
    public abstract void drive();
    public abstract void fly();

    public void PlayMusic()
    {
        System.out.println("Play Music");
    }
}

abstract class BMW extends Car
{
    

    public void drive()
    {
        System.out.println("Driving...");
    }
}

class UpdatedBMW extends BMW // concrete Class
{
    public void fly()
    {
        System.out.println("Flying...");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        Car obj = new UpdatedBMW();
        obj.drive();
        obj.PlayMusic();
        obj.fly();
    }
}

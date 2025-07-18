package AdvanceJava;

enum Status{
    Running, Fail, Pending, Success; // named constants
}

public class EnumIfand {
    public static void main(String[] args) {
        Status s = Status.Success;

        if(s == Status.Running)
            System.out.println("All Good");
        else if(s == Status.Fail)
            System.out.println("Try again");        
    }
}

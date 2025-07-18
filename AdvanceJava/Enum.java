package AdvanceJava;

enum Status{
    Running, Fail, Pending, Success; // named constants
}

public class Enum {
    public static void main(String[] args) {
        Status s = Status.Success;
        // System.out.println(s.ordinal());
        Status[] s1 = Status.values();

        for(Status i : s1)
        {
            System.out.println(i + ":" + i.ordinal());
        }
    }
}

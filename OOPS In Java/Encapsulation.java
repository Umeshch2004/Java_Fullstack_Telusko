class human
{
    private int age;
    private String name;

    public int getAge()
    {
        return age;
    }

    public void setAge(int a)
    {
        age = a;
    }


    public String getName()
    {
        return name;
    }

    public void setName(String a)
    {
        name = a;
    }
}

public class Encapsulation
{
    public static void main(String[] args) {
        human obj  = new human();
        obj.setAge(21);
        obj.setName("Umesh");

        // obj.age = 11;
        // obj.name = "Umesh";

        System.out.println(obj.getName() + " age is " + obj.getAge());
    }
}
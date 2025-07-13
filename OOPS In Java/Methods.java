
class Computer
{
    public void playMusic()
    {
        System.out.println("Music Playing..");
    }

    public String getMeAPen(int cost)
    {
        if(cost >= 10) return "Pen";
        
        return "Nothing";
    }
}


public class Methods {
    public static void main(String a[]) {
        Computer temp = new Computer();

        temp.playMusic();
        String s = temp.getMeAPen(20);
        System.out.println(s);
    }
}
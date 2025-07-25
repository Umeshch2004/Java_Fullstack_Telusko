class Counter{
    int cnt;
    public synchronized void increment()
    {
        cnt++;
    }
}

public class RaceCondition {
    public static void main(String[] args) throws InterruptedException {

        Counter c = new Counter();

        java.lang.Runnable obj1 = () -> {
            for(int i = 1; i <= 1000; i++) {
                c.increment();
            }
        };

        java.lang.Runnable obj2 = () -> 
        {
            for(int i = 1; i <= 1000; i++) {
                c.increment();
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start(); 
        t2.start();  

        t1.join();
        t2.join();

        System.out.println(c.cnt);
    }
}


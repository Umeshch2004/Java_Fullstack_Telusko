
// class A implements java.lang.Runnable {
//     public void run() {
//         for(int i = 1; i <= 5; i++) {
//             System.out.println("Hi");
//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }

// class B implements java.lang.Runnable {
//     public void run() {
//         for(int i = 1; i <= 5; i++) {
//             System.out.println("Hello");
//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }

public class Runnable {
    public static void main(String[] args) {
        java.lang.Runnable obj1 = () -> {
                    for(int i = 1; i <= 5; i++) {
                        System.out.println("Hi");
                        try {
                            Thread.sleep(10);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
        };

        java.lang.Runnable obj2 = () -> 
        {
        for(int i = 1; i <= 5; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

            t1.start(); 
            t2.start();  
    }
}


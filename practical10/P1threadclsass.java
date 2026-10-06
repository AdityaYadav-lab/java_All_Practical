package practical10;


// Main class
public class P1threadclsass {
    public static void main(String[] args) {
        // Thread objects banao
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        
        // Threads start karo
        t1.start();
        t2.start();
        
        System.out.println("Main thread khatam");
    }
}
// Thread 1
class MyThread1 extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread 1: " + i);
            try {
                Thread.sleep(1000);  // 1 second wait
            } catch (InterruptedException e) {
                e.getMessage();
            }
        }
    }
}

// Thread 2
class MyThread2 extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread 2: " + i);
            try {
                Thread.sleep(1200);
            } catch (InterruptedException e) {
                e.getMessage();
            }
        }
    }
}
/* Output (its not fixed o/p -->it will change )
Main thread khatam
Thread 1: 1
Thread 2: 1
Thread 1: 2
Thread 2: 2
Thread 1: 3
Thread 2: 3
Thread 1: 4
Thread 2: 4
Thread 1: 5
Thread 2: 5
*/
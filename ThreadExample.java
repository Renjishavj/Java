//1.Extending the Thread Class

// class MyThread extends Thread {
//     public void run() {
//         for (int i = 0; i < 5; i++) {
//             System.out.println(Thread.currentThread().getName() + " is running - " + i);
//             try {
//                 Thread.sleep(500); 
//             } catch (InterruptedException e) {
//                 System.out.println(e);
//             }
//         }
//     }
// }

// public class ThreadExample {
//     public static void main(String[] args) {
//         MyThread t1 = new MyThread();
//         MyThread t2 = new MyThread();

//         t1.start(); 
//         t2.start(); 
//     }
// }



//2.Implementing the Runnable Interface

class MyRunnable implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " is running - " + i);
            try {
                Thread.sleep(500); // Pause for 500 milliseconds
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        MyRunnable runnable = new MyRunnable();

        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);

        t1.start(); 
        t2.start(); 
    }
}


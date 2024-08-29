// public class InterruptExample {
//     public static void main(String[] args) {
//         Thread taskThread = new Thread(new Task());
//         taskThread.start();

//         // Main thread sleeps for 3 seconds
//         try {
//             Thread.sleep(3000);
//         } catch (InterruptedException e) {
//             System.out.println("Main thread interrupted: " + e);
//         }

//         // Optionally, the main thread could perform some additional tasks here
//         System.out.println("Main thread has finished sleeping.");
//     }
// }

// class Task implements Runnable {
//     @Override
//     public void run() {
//         try {
//             // Task sleeps for 5 seconds
//             for (int i = 0; i < 5; i++) {
//                 System.out.println("Task running, iteration: " + i);
//                 Thread.sleep(1000); // Sleep for 1 second
//             }
//         } catch (InterruptedException e) {
//             System.out.println("Task interrupted: " + e);
//         }
//     }
// }


// 2.with Interrupt
public class InterruptExample {
    public static void main(String[] args) {
        Thread thread = new Thread(new Task());
        thread.start();

        // Main thread sleeps for 2 seconds
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted: " + e);
        }

        // Interrupt the other thread
        thread.interrupt();
    }
}

class Task implements Runnable {
    @Override
    public void run() {
        try {
            // Task sleeps for 5 seconds
            for (int i = 0; i < 5; i++) {
                System.out.println("Task running, iteration: " + i);
                Thread.sleep(1000); // Sleep for 1 second
            }
        } catch (InterruptedException e) {
            System.out.println("Task interrupted: " + e);
        }
    }
}

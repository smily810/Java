package javaprograms;

import java.util.Scanner;

public class RunnableThreadExample {

    static class MyRunnable implements Runnable {

        private String threadName;

        public MyRunnable(String threadName) {
            this.threadName = threadName;
        }

        @Override
        public void run() {
            System.out.println(threadName + " is running.");
            try {
                Thread.sleep(500); // suspend for 500 ms
            } catch (InterruptedException e) {
                System.out.println(threadName + " was interrupted.");
            }
            System.out.println(threadName + " has finished running.");
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        /*
         OOPS with JAVA: BCSL306A
         Academic Year: 2025-26
         Dept. of CSE, JITD
        */

        System.out.print("Enter number of threads to create: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the leftover newline

        for (int i = 1; i <= n; i++) {
            scanner.nextLine();
            System.out.print("Enter name for thread " + i + ": ");
            String name = scanner.nextLine();

            Thread t = new Thread(new MyRunnable(name));
            t.start();
        }

        scanner.close();
    }
}

package javaprograms;

import java.util.Scanner;

public class ThreadWithSuperExample {

    // Custom thread class
    static class MyThread extends Thread {

        public MyThread(String name) {
            super(name); // call base class constructor
            start();     // start thread from constructor
        }

        @Override
        public void run() {
            for (int i = 1; i <= 5; i++) {
                System.out.println(getName() + " is running: " + i);
                try {
                    Thread.sleep(500); // simulate some work
                } catch (InterruptedException e) {
                    System.out.println(getName() + " was interrupted.");
                }
            }
            System.out.println(getName() + " has finished.");
        }
    }

    public static void main(String[] args) {

        /*
         OOPS with JAVA: BCSL306A
         Academic Year: 2025-26
         Dept. of CSE, JITD
        */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name for child thread: ");
        String threadName = scanner.nextLine();

        // Creating and starting custom thread
        MyThread child = new MyThread(threadName);

        // Main thread work
        for (int i = 1; i <= 5; i++) {
            System.out.println("Main thread is running: " + i);
            try {
                Thread.sleep(500); // simulate work
            } catch (InterruptedException e) {
                System.out.println("Main thread was interrupted.");
            }
        }

        System.out.println("Main thread has finished.");
        scanner.close();
    }
}

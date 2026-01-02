package javaprograms;

import java.util.Scanner;

public class OuterClass {

    // Outer class variable
    private String outerMessage;

    // Constructor for outer class
    public OuterClass(String outerMessage) {
        this.outerMessage = outerMessage;
    }

    // Outer class display method
    public void display() {
        System.out.println("Outer class display: " + outerMessage);
    }

    // Inner class
    class Inner {

        private String innerMessage;

        // Constructor for inner class
        public Inner(String innerMessage) {
            this.innerMessage = innerMessage;
        }

        /*
         OOPS with JAVA: BCSL306A
         Academic Year: 2025-26
         Dept. of CSE, JITD
        */

        // Inner class display method
        public void display() {
            System.out.println("Inner class display: " + innerMessage);
        }
    }

    // Main method
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Get message for outer class
        System.out.print("Enter a message for the outer class: ");
        String outerMsg = scanner.nextLine();

        // Create outer class object
        OuterClass outer = new OuterClass(outerMsg);

        // Get message for inner class
        System.out.print("Enter a message for the inner class: ");
        String innerMsg = scanner.nextLine();

        // Create inner class object using outer
        OuterClass.Inner inner = outer.new Inner(innerMsg);

        // Call display methods
        System.out.println("\nCalling display methods:");
        outer.display();   // Outer class display
        inner.display();   // Inner class display

        scanner.close();
    }
}

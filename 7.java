package javaprograms;

import java.util.Scanner;

public class ResizableDemo {

    // Interface definition
    interface Resizable {
        void resizeWidth(int width);
        void resizeHeight(int height);
    }

    // Rectangle class implementing Resizable
    static class Rectangle implements Resizable {

        private int width;
        private int height;

        // Constructor
        public Rectangle(int width, int height) {
            this.width = width;
            this.height = height;
        }

        // Resize width
        public void resizeWidth(int width) {
            this.width = width;
            System.out.println("Width resized to: " + this.width);
        }

        /*
         OOPS with JAVA: BCSL306A
         Academic Year: 2025-26
         Dept. of CSE, JITD
        */

        // Resize height
        public void resizeHeight(int height) {
            this.height = height;
            System.out.println("Height resized to: " + this.height);
        }

        // Display rectangle dimensions
        public void display() {
            System.out.println("Rectangle width: " + width + ", height: " + height);
        }
    }

    // Main method with user input
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Initial dimensions
        System.out.print("Enter initial width of rectangle: ");
        int initialWidth = scanner.nextInt();

        System.out.print("Enter initial height of rectangle: ");
        int initialHeight = scanner.nextInt();

        Rectangle rect = new Rectangle(initialWidth, initialHeight);
        rect.display();

        // Resize dimensions
        System.out.print("Enter new width to resize: ");
        int newWidth = scanner.nextInt();
        rect.resizeWidth(newWidth);

        System.out.print("Enter new height to resize: ");
        int newHeight = scanner.nextInt();
        rect.resizeHeight(newHeight);
        rect.display();

        scanner.close();
    }
}

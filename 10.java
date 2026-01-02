package javaprograms;

import java.util.Scanner;

// Simulating a class that would normally be in a package like "mypack"
class MyClass {

    private String message;

    public MyClass(String message) {
        this.message = message;
    }

    public void displayMessage() {
        System.out.println("Message from MyClass: " + message);
    }
}

public class DemoPackage {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a message: ");
        String input = scanner.nextLine();

        MyClass obj = new MyClass(input);
        obj.displayMessage();

        // Output:
        scanner.close();
    }
}

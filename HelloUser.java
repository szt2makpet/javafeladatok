import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for their name
        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();

        // Greet the user using their name
        System.out.printf("Hello, %s!", name);

        scanner.close();
    }
}

import java.util.Scanner;

public class DrawDiamond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the diamond height: ");
        int height = scanner.nextInt();

        // Draw the top half of the diamond
        for (int i = 1; i <= height; i++) {
            // Print spaces for alignment
            for (int j = 1; j <= height - i; j++) {
                System.out.print(" ");
            }

            // Print asterisks for the current row
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            // Move to the next line for the next row
            System.out.println();
        }

        // Draw the bottom half of the diamond
        for (int i = height - 1; i >= 1; i--) {
            // Print spaces for alignment
            for (int j = 1; j <= height - i; j++) {
                System.out.print(" ");
            }

            // Print asterisks for the current row
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            // Move to the next line for the next row
            System.out.println();
        }

        scanner.close();
    }
}

import java.util.Scanner;

public class DrawChessTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the chess table size: ");
        int size = scanner.nextInt();

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                // Alternate between "%" and " " based on row and column indices
                if ((i + j) % 2 == 0) {
                    System.out.print("%");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); // Move to the next line for the next row
        }

        scanner.close();
    }
}

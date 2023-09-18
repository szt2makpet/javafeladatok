import java.util.Scanner;

public class Cuboid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("cuboid hosszúsága: ");
        double length = scanner.nextDouble();

        System.out.print("cuboid szélessége: ");
        double width = scanner.nextDouble();

        System.out.print("cuboid magassága: ");
        double height = scanner.nextDouble();

        // Calculate the surface area
        double surfaceArea = 2 * (length * width + length * height + width * height);

        // Calculate the volume
        double volume = length * width * height;

        System.out.println("Surface Area: " + surfaceArea);
        System.out.println("Volume: " + volume);

        scanner.close();
    }
}

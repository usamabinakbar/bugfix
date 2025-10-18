import java.util.Scanner;

public class PackageDimensions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter item length: ");
        double length = scanner.nextDouble();
        System.out.print("Enter item width: ");
        double width = scanner.nextDouble();
        System.out.print("Enter item height: ");
        double height = scanner.nextDouble();

        // Add 2 units padding to each dimension for package
        double packageLength = length + 4; // 2 on each side
        double packageWidth = width + 4;
        double packageHeight = height + 4;
        double volume = packageLength * packageWidth * packageHeight;

        System.out.println("Package dimensions: " + packageLength + " x " + packageWidth + " x " + packageHeight);
        System.out.println("Package volume: " + volume);
    }
}

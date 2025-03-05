import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double side = Double.parseDouble(scanner.nextLine());
        double sideHeight = Double.parseDouble(scanner.nextLine());
        double area = side * sideHeight / 2.0;
        System.out.printf("Triangle area = %.2f",area);
    }
}

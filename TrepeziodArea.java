import java.util.Scanner;

public class TrepeziodArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double side1 = Double.parseDouble(scanner.nextLine());
        double side2 = Double.parseDouble(scanner.nextLine());
        double sideHeight = Double.parseDouble(scanner.nextLine());
        double area = (side1 + side2) * sideHeight / 2.0;
        System.out.println(area);
    }
}

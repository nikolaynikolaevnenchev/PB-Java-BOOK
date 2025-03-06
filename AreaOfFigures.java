import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String figureKind = scanner.nextLine();
        double area = 0;
        if (figureKind.equals("square")){
            double side = Double.parseDouble(scanner.nextLine());
            area = side * side;
        }else if (figureKind.equals("rectangle")){
            double side1 = Double.parseDouble(scanner.nextLine());
            double side2 = Double.parseDouble(scanner.nextLine());
            area = side1 * side2;
        }else if (figureKind.equals("circle")){
            double radius = Double.parseDouble(scanner.nextLine());
            area = Math.PI * radius * radius;
        }else if (figureKind.equals("triangle")){
            double side = Double.parseDouble(scanner.nextLine());
            double sideHeight = Double.parseDouble(scanner.nextLine());
            area = side * sideHeight / 2.0;
        }
        System.out.printf("%.3f",area);
    }
}

import java.util.Scanner;

public class GreetingByName1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String enterName = scanner.nextLine();
        System.out.println("Hello, " + enterName + "!");
    }
}

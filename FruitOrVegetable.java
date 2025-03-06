import java.util.Scanner;

public class FruitOrVegetable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String enterText = scanner.nextLine();
        boolean isValidFruit = enterText.equals("banana")||enterText.equals("apple")||enterText.equals("kiwi")||
                enterText.equals("cherry")||enterText.equals("lemon")||enterText.equals("grapes");
        boolean isValidVegetable = enterText.equals("tomato")||enterText.equals("cucumber")||enterText.equals("pepper")||
                enterText.equals("carrot");
        if (isValidFruit){
            System.out.println("fruit");
        }else if (isValidVegetable){
            System.out.println("vegetable");
        }else {
            System.out.println("unknown");
        }
    }
}

import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String productName = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        double calculatePrice = 0;
        boolean isValidDay = dayOfWeek.equals("Monday")||dayOfWeek.equals("Tuesday")||dayOfWeek.equals("Wednesday")||
                dayOfWeek.equals("Thursday")||dayOfWeek.equals("Friday")||dayOfWeek.equals("Saturday")||
                dayOfWeek.equals("Sunday");
        boolean isWorkDay = dayOfWeek.equals("Monday")||dayOfWeek.equals("Tuesday")||dayOfWeek.equals("Wednesday")||
                dayOfWeek.equals("Thursday")||dayOfWeek.equals("Friday");
        boolean isWeekEnd = dayOfWeek.equals("Saturday")||dayOfWeek.equals("Sunday");
        boolean isValidFruit = productName.equals("banana")||productName.equals("apple")||productName.equals("orange")||
                productName.equals("grapefruit")||productName.equals("kiwi")||productName.equals("pineapple")||
                productName.equals("grapes");
        if (isWorkDay){
            if (productName.equals("banana")){
                calculatePrice = quantity * 2.5;
            }else if (productName.equals("apple")){
                calculatePrice = quantity * 1.2;
            }else if (productName.equals("orange")){
                calculatePrice = quantity * 0.85;
            }else if (productName.equals("grapefruit")){
                calculatePrice = quantity * 1.45;
            }else if (productName.equals("kiwi")){
                calculatePrice = quantity * 2.7;
            }else if (productName.equals("pineapple")){
                calculatePrice = quantity * 5.5;
            }else if (productName.equals("grapes")){
                calculatePrice = quantity * 3.85;
            }
        }else if(isWeekEnd){
            if (productName.equals("banana")){
                calculatePrice = quantity * 2.7;
            }else if (productName.equals("apple")){
                calculatePrice = quantity * 1.25;
            }else if (productName.equals("orange")){
                calculatePrice = quantity * 0.9;
            }else if (productName.equals("grapefruit")){
                calculatePrice = quantity * 1.6;
            }else if (productName.equals("kiwi")){
                calculatePrice = quantity * 3;
            }else if (productName.equals("pineapple")){
                calculatePrice = quantity * 5.6;
            }else if (productName.equals("grapes")){
                calculatePrice = quantity * 4.2;
            }
        }
        if (isValidDay && isValidFruit){
            System.out.printf("%.2f",calculatePrice);
        }else {
            System.out.println("error");
        }
    }
}

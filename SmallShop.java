import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String productName = scanner.nextLine();
        String town = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        double calculatePrice = 0;
        if (productName.equals("coffee")){
            if (town.equals("Sofia")){
                calculatePrice = quantity * 0.5;
            }else if (town.equals("Plovdiv")){
                calculatePrice = quantity * 0.4;
            }else if (town.equals("Varna")){
                calculatePrice = quantity * 0.45;
            }
        }else if (productName.equals("water")){
            if (town.equals("Sofia")){
                calculatePrice = quantity * 0.8;
            }else if (town.equals("Plovdiv")){
                calculatePrice = quantity * 0.7;
            }else if (town.equals("Varna")){
                calculatePrice = quantity * 0.7;
            }
        }else if (productName.equals("beer")){
            if (town.equals("Sofia")){
                calculatePrice = quantity * 1.2;
            }else if (town.equals("Plovdiv")){
                calculatePrice = quantity * 1.15;
            }else if (town.equals("Varna")){
                calculatePrice = quantity * 1.1;
            }
        }else if (productName.equals("sweets")){
            if (town.equals("Sofia")){
                calculatePrice = quantity * 1.45;
            }else if (town.equals("Plovdiv")){
                calculatePrice = quantity * 1.3;
            }else if (town.equals("Varna")){
                calculatePrice = quantity * 1.35;
            }
        }else if (productName.equals("peanuts")){
            if (town.equals("Sofia")){
                calculatePrice = quantity * 1.6;
            }else if (town.equals("Plovdiv")){
                calculatePrice = quantity * 1.5;
            }else if (town.equals("Varna")){
                calculatePrice = quantity * 1.55;
            }
        }
        System.out.println(calculatePrice);
    }
}

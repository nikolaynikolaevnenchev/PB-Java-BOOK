import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double amount = Double.parseDouble(scanner.nextLine());
        String enterCurrency = scanner.nextLine();
        String finalCurrency = scanner.nextLine();
        double calculatePrice = 0;
        double usd = 1.79549;
        double eur = 1.95583;
        double gbp = 2.53405;
        if (enterCurrency.equals("BGN")){
            if (finalCurrency.equals("USD")){
                calculatePrice = amount / usd;
            }else if (finalCurrency.equals("EUR")){
                calculatePrice = amount / eur;
            }else if (finalCurrency.equals("GBP")){
                calculatePrice = amount / gbp;
            }
        }else if (enterCurrency.equals("USD")){
            if (finalCurrency.equals("BGN")){
                calculatePrice = amount * usd;
            }else if (finalCurrency.equals("EUR")){
                calculatePrice = amount * usd / eur;
            }else if (finalCurrency.equals("GBP")){
                calculatePrice = amount * usd / gbp;
            }
        }else if (enterCurrency.equals("EUR")){
            if (finalCurrency.equals("BGN")){
                calculatePrice = amount * eur;
            }else if (finalCurrency.equals("USD")){
                calculatePrice = amount * eur / usd;
            }else if (finalCurrency.equals("GBP")){
                calculatePrice = amount * eur / gbp;
            }
        }else if (enterCurrency.equals("GBP")){
            if (finalCurrency.equals("BGN")){
                calculatePrice = amount * gbp;
            }else if (finalCurrency.equals("EUR")){
                calculatePrice = amount * gbp / eur;
            }else if (finalCurrency.equals("USD")){
                calculatePrice = amount * gbp / usd;
            }
        }
        System.out.printf("%.2f %s",calculatePrice,finalCurrency);
    }
}

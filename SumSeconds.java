import java.util.Scanner;

public class SumSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sec1 = Integer.parseInt(scanner.nextLine());
        int sec2 = Integer.parseInt(scanner.nextLine());
        int sec3 = Integer.parseInt(scanner.nextLine());
        int totalTimeSec = sec1 + sec2 + sec3;
        int newMinutes = totalTimeSec / 60;
        int newSeconds = totalTimeSec % 60;
        if (newSeconds < 10){
            System.out.printf("%d:0%d",newMinutes,newSeconds);
        }else {
            System.out.printf("%d:%d",newMinutes,newSeconds);
        }
    }
}

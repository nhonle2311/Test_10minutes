import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Date date = new Date();
        System.out.println("input day " );
        date.setDay(scanner.nextInt());
        System.out.println("ouput day " + (date.getDay() + 1));

    }
}
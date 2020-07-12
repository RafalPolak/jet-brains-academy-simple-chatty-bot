import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int reese = scanner.nextInt();
        boolean isWeekend = scanner.nextBoolean();
        if (isWeekend) {
            System.out.println(reese >= 15 && reese <= 25);
        } else {
            System.out.println(reese >= 10 && reese <= 20);
        }
    }
}
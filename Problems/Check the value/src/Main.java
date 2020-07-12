import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num < 10) {
            System.out.print(true);
        } else {
            System.out.print(false);
        }
    }
}
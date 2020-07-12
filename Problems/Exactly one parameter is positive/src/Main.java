import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numA = scanner.nextInt();
        int numB = scanner.nextInt();
        int numC = scanner.nextInt();
        boolean isOnlyOnePositive = false;
        if (numA > 0 && numB <= 0 && numC <= 0) {
            isOnlyOnePositive = true;
        } else if (numA <= 0 && numB > 0 && numC <= 0) {
            isOnlyOnePositive = true;
        } else if (numA <= 0 && numB <= 0 && numC > 0) {
            isOnlyOnePositive = true;
        }
        System.out.println(isOnlyOnePositive);
    }
}
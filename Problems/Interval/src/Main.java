import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numToTest = scanner.nextInt();
        if ((-15 < numToTest && numToTest <= 12)
                || (numToTest > 14 && numToTest < 17)
                || (numToTest >= 19)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
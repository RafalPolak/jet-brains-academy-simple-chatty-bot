import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numToCheck;
        while (scanner.hasNext()) {
            numToCheck = scanner.nextInt();
            if (numToCheck == 0) {
                break;
            }

            if (numToCheck % 2 == 0) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
        }
    }
}

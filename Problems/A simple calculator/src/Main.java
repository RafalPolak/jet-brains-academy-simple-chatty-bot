import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long numA = scanner.nextLong();
        String operation = scanner.next();
        long numB = scanner.nextLong();
        switch (operation) {
            case "+":
                System.out.println(numA + numB);
                break;
            case "-":
                System.out.println(numA - numB);
                break;
            case "/":
                if (numB == 0) {
                    System.out.println("Division by 0!");
                } else {
                    System.out.println(numA / numB);
                }
                break;
            case "*":
                System.out.println(numA * numB);
                break;
            default:
                System.out.println("Unknown operator");
                break;
        }
    }
}
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfInputs = scanner.nextInt();
        int numToTest;
        int result = 0;
        for (int i = 0; i < numOfInputs; i++) {
            numToTest = scanner.nextInt();
            if (numToTest % 4 == 0 && numToTest > result) {
                result = numToTest;
            }
        }
        System.out.println(result);

    }
}
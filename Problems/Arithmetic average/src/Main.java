import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int intervalStart = scanner.nextInt();
        int intervalEnd = scanner.nextInt();
        double sum = 0;
        int numOfDivisible = 0;

        for (int i = intervalStart; i <= intervalEnd; i++) {
            if (i % 3 == 0) {
                sum += i;
                numOfDivisible++;
            }
        }
        System.out.println(sum / numOfDivisible);
    }
}
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numToPrint = scanner.nextInt();
        int howManyNum = 0;
        for (int i = 1; i <= numToPrint; i++) {
            int howMany = 0;
            while (howMany < i) {
                System.out.print(i + " ");
                howMany++;
                howManyNum++;
                if (howManyNum == numToPrint) {
                    break;
                }
            }
            if (howManyNum == numToPrint) {
                break;
            }
        }
    }
}
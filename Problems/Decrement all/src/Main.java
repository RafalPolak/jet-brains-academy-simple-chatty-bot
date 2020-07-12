import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String result = "";
        int num = 0;
        for (int i = 0; i < 4; i++) {
            num = scanner.nextInt();
            result += --num + " ";
        }
        System.out.println(result);
    }
}
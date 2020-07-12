import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int desks = 0;
        for (int pointer = 0; pointer < 3; pointer++) {
            desks += (scanner.nextInt() + 1) / 2;
        }
        System.out.println(desks);
    }
}
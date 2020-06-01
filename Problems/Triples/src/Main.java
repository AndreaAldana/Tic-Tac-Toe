import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] numbers = new int[len];

        for (int i = 0; i < len; i++) {
            numbers[i] = sc.nextInt();
        }

        int counter = 0;
        for (int i = 0; i < len - 2 ; i++) {
            if (numbers[i] - numbers[i + 1] == -1 && numbers[i + 1] - numbers[i + 2] == -1) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}
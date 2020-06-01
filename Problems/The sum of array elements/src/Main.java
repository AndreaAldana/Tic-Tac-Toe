import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int [] numbers = new int [len];
        int counter = 0;

        for(int i = 0; i < numbers.length;i++) {
            numbers[i] = sc.nextInt();
            counter += numbers[i];
        }
        System.out.println(counter);


    }
}

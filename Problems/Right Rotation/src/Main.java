import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arr = scanner.nextLine().split(" ");
        int rotations = scanner.nextInt();
        int[] newArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArray[(i + rotations) % arr.length] = Integer.parseInt(arr[i]);
        }
        for (int n : newArray) {
            System.out.print(n + " ");
        }

    }
}
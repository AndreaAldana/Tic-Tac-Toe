import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        char[][] stars = new char[n][n];

        int midFile = stars.length / 2;
        int midCol = stars[0].length / 2;

        for (int i = 0; i < stars.length; i++) {
            for (int j = 0; j < stars[0].length; j++) {
                if (i == midFile || j == midCol || i == j || i == n - j - 1) {
                    stars[i][j] = '*';
                } else {
                    stars[i][j] = '.';
                }
                System.out.print(stars[i][j] + " ");

            }
            System.out.println();
        }
    }
}
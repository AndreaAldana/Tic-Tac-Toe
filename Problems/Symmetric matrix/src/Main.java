import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] array = new int[n][n];

        for(int i = 0; i < array.length;i++){
            array[i][i] = sc.nextInt();
        }
    }
}
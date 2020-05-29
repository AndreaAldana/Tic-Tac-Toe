package tictactoe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter cells: ");
        String enter = sc.next();
        System.out.println("---------");
        System.out.println("| " + enter.charAt(0) + " "+ enter.charAt(1) + " "+enter.charAt(2) +" |");
        System.out.println("| " + enter.charAt(3) + " "+ enter.charAt(4) + " "+enter.charAt(5) +" |");
        System.out.println("| " + enter.charAt(6) + " "+ enter.charAt(7) + " "+enter.charAt(8) +" |");
        System.out.println("---------");
    }
}

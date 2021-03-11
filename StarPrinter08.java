package day0311;

import java.util.Scanner;

public class StarPrinter08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("출력할 줄 수를 입력하시오.");
        System.out.print("> ");
        int userNumber = sc.nextInt();

        char[][] stars = new char[2 * userNumber - 1][2 * userNumber - 1];
        for (int i = 0; i < 2 * userNumber - 1; i++) {
            for (int j = 0; j < stars.length; j++) {
                stars[i][j] = '*';
            }
            if (i < userNumber) {
                for (int j = 0; j < 2 * userNumber - 2 - i; j++) {
                    stars[i][j] = ' ';
                }
            }
            if (i >= userNumber) {
                for (int j = 0; j < i; j++) {
                    stars[i][j] = ' ';
                }
            }

        }

        for (int i = 0; i < 2 * userNumber - 1; i++) {
            for (int j = 0; j < stars[i].length; j++) {
                System.out.print(stars[i][j]);

            }

            System.out.println();
        }

        sc.close();
    }
}

package day0311;

import java.util.Scanner;

public class StarPrinter05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("별찍기 5번");
        System.out.println("출력할 줄 수를 입력하시오.");
        System.out.print("> ");
        int userNumber = sc.nextInt();

        char[][] stars = new char[userNumber][2 * userNumber - 1];

        for (int i = 0; i < stars.length; i++) {
            // 별의 갯수 = (i + 1) * 2 -1
            //         = 2 * 1 + 2 - 1
            //         = 2 * i + 1
            int starWidth = 2 * i + 1;
            
            //별이 찍히는 시작 지점 : 4 - 3 - 2 - 1 - 0
            //                  = useNumber - (i + 1)
            int starStart = userNumber - (i + 1);
            
            // 5번째에서 시작하는 대신 조건의 범위도 뒤로 미뤄준다. 
            // 조건식에서 "+" 처럼 식의 사용도 가능 
            
            for (int j = starStart; j < starStart+starWidth; j++) {
                stars[i][j] = '*';
            }
//   내생각    for (int j = 0; j < stars.length - i - 1; j++) {
//                stars[i][j] = ' ';
//            }
//            for (int j = stars.length - i; j <= stars.length-i; j++) {
//                stars[i][j] = '*';
//            }

        }

        for (int i = 0; i < stars.length; i++) {
            for (int j = 0; j < stars[i].length; j++) {
                System.out.print(stars[i][j]);

            }

           System.out.println();
        }

        sc.close();
    }
}

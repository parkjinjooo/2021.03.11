package day0311;

import java.util.Iterator;
import java.util.Scanner;

public class StarPrinterTeacherAnswer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("별찍기 3번");
        System.out.println("출력할 줄 수");
        System.out.print("> ");
        int userNumber = sc.nextInt();

        char[][] stars = new char[userNumber][userNumber];

        for (int i = 0; i < stars.length; i++) {
            for (int j = 0; j < stars[i].length; j++) {

                // 공백을 담당하는 if
                if (j < userNumber - (i + 1)) {
                    stars[i][j] = ' ';
                } else {
                    stars[i][j] = '*';
                }
                 
//     or        for (int j = 0; j < userNumber -(i+1); j++) {
//  이 경우에는        stars[i][j] = ' ';
// 17번째줄도 주석   }
//                for (int j = userNumber -(i+1); j < userNumber; j++) {
//                    stars[i][j] = '*';
//                }
//                
                
                
            }
           for (int j = 0; j < stars.length; j++) {
            System.out.println(stars[i][j]);
        } 
            
            
            
            
        }
        sc.close();
    }
}

package day0311;

// 사용자가 2가지 int값을 입력하면
// 해당 숫자를 산술연산하면서 출력하는 프로그램을 작성하시오.

// 단, +, -는 메소드가 출력까지 담당하고
//    *,/,%는 메소드가 결과값을 리턴만 해줍니다.
// 또한 / 의 경우, 결과 값이 실수의 형태가 나오도록 메소드를 작성하시오.

import java.util.Scanner;

public class Calculator01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("첫번째 숫자");
        System.out.print("> ");
        int Number = sc.nextInt();

        System.out.println("두번째 숫자");
        System.out.print("> ");
        int Number2 = sc.nextInt();

        plus(Number, Number2);
        subtract(Number, Number2);
        System.out.println("a * b: " + mutiply(Number, Number2));
        System.out.println("a / b: " + divide(Number, Number2));
        System.out.println("a % b: " + remain(Number, Number2));

        sc.close();
    }

    public static void plus(int a, int b) {
        System.out.println("a + b: " + (a + b));
    }

    public static void subtract(int a, int b) {
        System.out.println("a - b: " + (a - b));
    }

    public static int mutiply(int a, int b) {
        return a * b;
    }

    public static double divide(int a, int b) {
        return (double) a / b;
    }

    public static int remain(int a, int b) {
        return a % b;
    }
}

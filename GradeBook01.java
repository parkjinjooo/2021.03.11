package day0311;
// 사용자로부터 번호, 이름, 국어, 영어, 수학 점수를 입력 받아서

// 에쁘게 출력하는 프로그램을 만드시오.
// 해당 프로그램은 총 6명의 학생의 정보를 입력할 수 있습니다.

// 단, 국어 영어 수학 점수는 2차원 배열을 사용하여 
// 묶어서 관리가 가능하게 만드시오(11시 20분까지)

import java.util.Scanner;

public class GradeBook01 {
    static final int STUDENT_SIZE = 6;
    static final int SUBJECT_SIZE = 3;
    static final int SCORE_MIN = 0;
    static final int SCORE_MAX = 100;
    static final int INDEX_KOREAN = 0;
    static final int INDEX_ENGLISH = 1;
    static final int INDEX_MATH = 2;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] id = new int[STUDENT_SIZE];
        String[] name = new String[STUDENT_SIZE];
        int[][] subject = new int[SUBJECT_SIZE][STUDENT_SIZE];
        int index = 0;
        // int subjectIndex = 0;
        // subjectIndex를 만들기 보다 인덱스 과목을 상수로 만들고 
        // 상수로 입력하는 것이 코드가 더 깔끔하고 간결해진다. --> 수정 완료 

        while (true) {
            System.out.println("1.[입력]  2.[출력]  3.[종료]");
            System.out.print("> ");
            int userChoice = sc.nextInt();

            if (userChoice == 1) {
                if (index < STUDENT_SIZE) {
                    System.out.println("번호");
                    System.out.print("> ");
                    id[index] = sc.nextInt();

                    System.out.println("이름");
                    System.out.print("> ");
                    name[index] = sc.next();

                    System.out.println("국어 점수");
                    System.out.print("> ");
                    subject[INDEX_KOREAN][index] = sc.nextInt();

                    while (!(subject[INDEX_KOREAN][index] >= SCORE_MIN && subject[INDEX_KOREAN][index] <= SCORE_MAX)) {
                        System.out.println("잘못 입력하셨습니다.");
                        System.out.println("국어");
                        System.out.print("> ");
                        subject[INDEX_KOREAN][index] = sc.nextInt();
                    }

                    System.out.println("영어 점수");
                    System.out.print("> ");
                    subject[INDEX_ENGLISH][index] = sc.nextInt();

                    while (!(subject[INDEX_ENGLISH ][index] >= SCORE_MIN
                            && subject[INDEX_ENGLISH][index] <= SCORE_MAX)) {
                        System.out.println("잘못 입력하셨습니다.");
                        System.out.println("영어");
                        System.out.print("> ");
                        subject[INDEX_ENGLISH][index] = sc.nextInt();
                    }

                    System.out.println("수학 점수");
                    System.out.print("> ");
                    subject[INDEX_MATH][index] = sc.nextInt();

                    while (!(subject[INDEX_MATH][index] >= SCORE_MIN
                            && subject[INDEX_MATH][index] <= SCORE_MAX)) {
                        System.out.println("잘못 입력하셨습니다.");
                        System.out.println("수학");
                        System.out.print("> ");
                        subject[INDEX_MATH][index] = sc.nextInt();
                    }

                    index++;

                } else {
                    System.out.println("더 이상 입력할 수 없습니다.");
                }
            } else if (userChoice == 2) {
                if (index > 0) {
                    for (int i = 0; i < index; i++) {

                        System.out.println();
                        System.out.println("======" + name[i] + "학생의 정보========");
                        System.out.printf("번호: %d번 이름:%s \n", id[i], name[i]);
                        System.out.printf("국어: %03d점 영어: %03d점 수학 %03d점\n", subject[INDEX_KOREAN][i],
                                subject[INDEX_ENGLISH][i], subject[INDEX_MATH][i]);

                        int sum = subject[INDEX_KOREAN][i] + subject[INDEX_ENGLISH][i]
                                + subject[INDEX_MATH][i];
                        double average = (double) sum / SUBJECT_SIZE;

                        System.out.printf("총점: %03d점 평균: %06.2f점 \n", sum, average);
                        System.out.println("=================================");
                        System.out.println();

                    }

                }

                else {
                    System.out.println("정보를 먼저 입력해주세요.");
                }

            } else if (userChoice == 3) {
                System.out.println("이용해주셔서 갑사합니다.");
                break;
            }

        }
    }
}
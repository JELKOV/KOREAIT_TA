/**
 * # 주석을 보고 직접 코드를 작성해 보세요!
 * 학점 출력하기
 *
 * (1) 점수에 따라 다르게 학점을 출력하려면 어떻게 해야 할까?
 *   - if-else if 조건문을 사용해서 점수 구간을 나누자.
 * (2) Scanner를 사용하여 사용자로부터 점수를 입력받는다.
 * (3) 점수에 따라 다음과 같이 학점을 출력한다:
 *     - 90점 이상: "A학점입니다."
 *     - 80점 이상: "B학점입니다."
 *     - 70점 이상: "C학점입니다."
 *     - 60점 이상: "D학점입니다."
 *     - 그 외: "F학점입니다."
 * (4) Scanner 사용 후에는 반드시 close() 메서드로 자원을 해제해야 한다.
 */

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        // (2) 사용자로부터 점수 입력 받기
        Scanner scanner = new Scanner(System.in);
        System.out.print("점수를 입력하세요: ");
        int score = scanner.nextInt();

        // (4) Scanner 닫기
        scanner.close();

        // (3) 조건문으로 점수 구간에 따라 학점 출력
        if (score >= 90) {
            System.out.println("A학점입니다.");
        } else if (score >= 80) {
            System.out.println("B학점입니다.");
        } else if (score >= 70) {
            System.out.println("C학점입니다.");
        } else if (score >= 60) {
            System.out.println("D학점입니다.");
        } else {
            System.out.println("F학점입니다.");
        }
    }
}

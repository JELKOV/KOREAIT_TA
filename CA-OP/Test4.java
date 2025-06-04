/**
 * # 주석을 보고 직접 코드를 작성해 보세요!
 * 숫자 범위를 판별하는 프로그램
 *
 * (1) 사용자가 입력한 숫자가 어떤 범위에 속하는지 판별해 보자.
 *     - 음수인지?
 *     - 0 이상 100 이하인지?
 *     - 100보다 큰지?
 *
 * (2) Scanner를 사용하여 숫자를 입력받는다.
 * (3) if-else if 조건문을 사용하여 다음 조건에 따라 출력한다:
 *     - 숫자가 0보다 작으면: "음수입니다."
 *     - 숫자가 0 이상이고 100 이하이면: "0에서 100 사이의 숫자입니다."
 *     - 숫자가 100보다 크면: "100보다 큰 숫자입니다."
 * (4) 마지막에는 Scanner를 닫아 자원을 해제하자.
 */

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        // (2) 사용자로부터 숫자 입력받기
        Scanner scanner = new Scanner(System.in);

        System.out.print("숫자를 입력하세요: ");
        int number = scanner.nextInt();  // 정수 입력

        // (4) Scanner 닫기
        scanner.close();

        // (3) 조건에 따라 범위 판별 및 출력
        if (number < 0) {
            System.out.println("음수입니다.");
        } else if (number >= 0 && number <= 100) {
            System.out.println("0에서 100 사이의 숫자입니다.");
        } else {
            System.out.println("100보다 큰 숫자입니다.");
        }
    }
}

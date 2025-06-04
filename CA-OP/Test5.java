/**
 * # 주석을 읽고 직접 코드를 작성해 보세요!
 * 나이를 판별하는 프로그램
 *
 * (1) 사용자로부터 나이를 입력받는다.
 * (2) 입력한 나이에 따라 다음 범위로 구분하여 메시지를 출력한다:
 *     - 0 미만: "잘못된 나이입니다."
 *     - 0 ~ 12세: "어린이입니다."
 *     - 13 ~ 19세: "청소년입니다."
 *     - 20 ~ 64세: "성인입니다."
 *     - 65세 이상: "노인입니다."
 * (3) 조건에 따라 if-else if문을 사용하여 분기 처리한다.
 * (4) 입력을 마친 후에는 Scanner를 닫아 자원을 해제한다.
 */

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        // (1) Scanner를 사용해 나이 입력 받기
        Scanner scanner = new Scanner(System.in);
        System.out.print("나이를 입력하세요: ");
        int age = scanner.nextInt();

        // (4) 입력 완료 후 자원 해제
        scanner.close();

        // (2)(3) 나이에 따라 조건 분기
        if (age < 0) {
            System.out.println("잘못된 나이입니다.");
        } else if (age < 13) {
            System.out.println("어린이입니다.");  // 0~12
        } else if (age < 20) {
            System.out.println("청소년입니다.");  // 13~19
        } else if (age < 65) {
            System.out.println("성인입니다.");    // 20~64
        } else {
            System.out.println("노인입니다.");    // 65 이상
        }
    }
}

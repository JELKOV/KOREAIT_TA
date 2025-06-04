/**
 * # 주석을 보고 코드를 작성해 보세요!
 * 짝수 홀수 판별하기
 *
 * (1) 숫자가 짝수인지 홀수인지 판별하려면 어떻게 해야 할까?
 *   - 힌트: 숫자를 2로 나누었을 때 나머지를 확인해보자.
 * (2) Scanner를 사용하여 사용자로부터 숫자를 입력받는다.
 * (3) 조건문을 사용하여 짝수이면 "짝수입니다.", 홀수이면 "홀수입니다." 출력
 *   - 짝수: 2로 나눈 나머지가 0
 *   - 홀수: 나머지가 1
 * (4) Scanner를 다 사용한 뒤에는 close()를 호출하여 메모리를 정리한다.
 */

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // (2) 사용자로부터 숫자 입력 받기
        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자를 입력하세요: ");
        int number = scanner.nextInt();  // 정수 입력

        // (4) 자원 해제
        scanner.close();

        // (3) 조건문을 사용하여 짝수 / 홀수 판별
        if (number % 2 == 0) {
            System.out.println("짝수입니다.");
        } else {
            System.out.println("홀수입니다.");
        }
    }
}

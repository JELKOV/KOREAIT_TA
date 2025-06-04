/**
 * # 주석을 보고 직접 코드를 작성해 보세요!
 * 숫자를 비교하는 프로그램
 *
 * (1) 두 개의 숫자를 비교하려면 어떻게 해야 할까?
 *   - if문을 사용해서 크다/작다/같다 조건을 구분하자.
 * (2) Scanner를 사용하여 사용자로부터 두 숫자를 입력받는다.
 * (3) 조건문을 사용하여 다음 중 하나를 출력한다:
 *   - 첫 번째 숫자가 크면: "첫 번째 숫자가 두 번째 숫자보다 큽니다."
 *   - 두 번째 숫자가 크면: "두 번째 숫자가 첫 번째 숫자보다 큽니다."
 *   - 두 숫자가 같으면: "두 숫자는 같습니다."
 * (4) 입력이 끝나면 Scanner는 꼭 close()로 닫아주자.
 */

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        // (2) 숫자 2개 입력받기
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요: ");
        int num1 = scanner.nextInt();  // 첫 번째 숫자 입력

        System.out.print("두 번째 숫자를 입력하세요: ");
        int num2 = scanner.nextInt();  // 두 번째 숫자 입력

        // (4) Scanner 닫기
        scanner.close();

        // (3) 조건문으로 비교 결과 출력
        if (num1 > num2) {
            System.out.println("첫 번째 숫자가 두 번째 숫자보다 큽니다.");
        } else if (num1 < num2) {
            System.out.println("두 번째 숫자가 첫 번째 숫자보다 큽니다.");
        } else {
            System.out.println("두 숫자는 같습니다.");
        }
    }
}

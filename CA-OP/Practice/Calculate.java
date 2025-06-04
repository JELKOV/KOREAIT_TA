/**
 * # 주석을 보고 직접 코드를 완성해 보세요!
 * 간단한 콘솔 계산기 만들기
 *
 * (1) 사용자로부터 숫자 2개와 연산자(+, -, *, /)를 입력받는다.
 * (2) 입력된 연산자에 따라 두 숫자를 계산한다.
 * (3) 연산 결과를 출력한다.
 * (4) 0으로 나누는 경우는 따로 처리한다.
 * (5) Scanner 사용 후에는 자원을 해제한다.
 */

package Practice;

import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 숫자 2개 입력 받기
        System.out.print("첫 번째 숫자를 입력하세요: ");
        double num1 = scanner.nextDouble();

        System.out.print("두 번째 숫자를 입력하세요: ");
        double num2 = scanner.nextDouble();

        // 연산자 입력 받기
        System.out.print("연산자 입력 (+, -, *, /): ");
        String operator = scanner.next();

        double result = 0;
        boolean valid = true;

        // 연산자에 따라 계산
        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 == 0) {
                    System.out.println("0으로 나눌 수 없습니다.");
                    valid = false;
                } else {
                    result = num1 / num2;
                }
                break;
            default:
                System.out.println("잘못된 연산자입니다.");
                valid = false;
        }

        // 결과 출력
        if (valid) {
            System.out.println("결과: " + result);
        }

        scanner.close();
    }

}

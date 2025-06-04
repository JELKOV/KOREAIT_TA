/**
 * # 주석을 따라 코드를 직접 작성해 보세요!
 * 로그인 양식 만들기
 * - 사용자가 입력한 ID와 비밀번호가 지정된 값과 일치하는지 확인합니다.
 * (1) Scanner를 사용하여 문자열 ID와 비밀번호를 입력받는다.
 * (2) ID가 "admin"이고 비밀번호가 "1234"인 경우 → "로그인 성공!" 출력
 * (3) 둘 중 하나라도 틀린 경우 → "로그인 실패!" 출력
 * (4) 문자열 비교는 ==이 아니라 equals()를 사용해야 함
 * (5) Scanner 사용 후에는 close() 메서드로 자원 해제
 */

import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        // (1) 사용자로부터 ID와 비밀번호 입력받기
        Scanner scanner = new Scanner(System.in);

        System.out.print("ID 입력: ");
        String id = scanner.nextLine();  // 문자열 입력 받기

        System.out.print("비밀번호 입력: ");
        String pw = scanner.nextLine();  // 문자열 입력 받기

        // (5) Scanner 자원 해제
        scanner.close();

        // (4) 문자열 비교는 equals()로!
        // (2), (3) 조건에 따라 결과 출력
        if (id.equals("admin") && pw.equals("1234")) {
            System.out.println("로그인 성공!");
        } else {
            System.out.println("로그인 실패!");
        }
    }
}

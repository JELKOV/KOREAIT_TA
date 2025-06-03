import java.util.Scanner;

public abstract class Test7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("ID 입력: ");
        String id = scanner.nextLine();

        System.out.print("비밀번호 입력: ");
        String pw = scanner.nextLine();

        scanner.close();

        // 논리 연산자 && 사용 + 문자열 비교는 equals 사용
        if (id.equals("admin") && pw.equals("1234")) {
            System.out.println("로그인 성공!");
        } else {
            System.out.println("로그인 실패!");
        }
    }

}

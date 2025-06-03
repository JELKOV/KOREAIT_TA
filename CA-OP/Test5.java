import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        // 나이 판별
        Scanner scanner = new Scanner(System.in);
        System.out.print("나이를 입력하세요: ");
        int age = scanner.nextInt();
        scanner.close();

        if (age < 0) {
            System.out.println("잘못된 나이입니다.");
        } else if (age < 13) {
            System.out.println("어린이입니다.");
        } else if (age < 20) {
            System.out.println("청소년입니다.");
        } else if (age < 65) {
            System.out.println("성인입니다.");
        } else {
            System.out.println("노인입니다.");
        }
    }
}

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        // 학점 출력기
        Scanner scanner = new Scanner(System.in);
        System.out.print("점수를 입력하세요: ");
        int score = scanner.nextInt();
        scanner.close();
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

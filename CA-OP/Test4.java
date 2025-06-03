import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        // 숫자 범위 판별
        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자를 입력하세요: ");
        int number = scanner.nextInt();
        scanner.close();

        if (number < 0) {
            System.out.println("음수입니다.");
        } else if (number >= 0 && number <= 100) {
            System.out.println("0에서 100 사이의 숫자입니다.");
        } else {
            System.out.println("100보다 큰 숫자입니다.");
        }
    }
}

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        // 짝수 홀수 판별
        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자를 입력하세요: ");
        int number = scanner.nextInt();
        scanner.close();
        if (number % 2 == 0) {
            System.out.println("짝수입니다.");
        } else {
            System.out.println("홀수입니다.");
        }
    }
}
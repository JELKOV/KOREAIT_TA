import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        // 숫자 비교하기
        Scanner scanner = new Scanner(System.in);
        System.out.print("첫 번째 숫자를 입력하세요: ");
        int num1 = scanner.nextInt();
        System.out.print("두 번째 숫자를 입력하세요: ");
        int num2 = scanner.nextInt();
        scanner.close();

        if (num1 > num2) {
            System.out.println(num1 + "이(가) " + num2 + "보다 큽니다.");
        } else if (num1 < num2) {
            System.out.println(num1 + "이(가) " + num2 + "보다 작습니다.");
        } else {
            System.out.println("두 숫자는 같습니다.");
        }
    }
}

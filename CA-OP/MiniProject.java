import java.util.Scanner;

public class MiniProject {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 음료 메뉴 출력
        System.out.println("음료 메뉴:");
        System.out.println("1. 아메리카노 - 3000원");
        System.out.println("2. 카페라떼 - 3500원");
        System.out.println("3. 카푸치노 - 4000원");
        System.out.println("4. 에스프레소 - 2500원");

        // 투입 금액
        System.out.print("투입 금액을 입력하세요: ");
        int money = scanner.nextInt();

        // 음료 선택
        System.out.print("음료를 선택하세요 (1-4): ");
        int choice = scanner.nextInt();
        int price = 0;
        switch (choice) {
            case 1:
                price = 3000;
                break;
            case 2:
                price = 3500;
                break;
            case 3:
                price = 4000;
                break;
            case 4:
                price = 2500;
                break;
            default:
                System.out.println("잘못된 선택입니다.");
                scanner.close();
                return; // 프로그램 종료
        }

        // 잔액 비교
        if (money >= price) {
            System.out.println("선택한 음료를 구매했습니다. 잔액: " + (money - price) + "원");
        } else {
            System.out.println("잔액이 부족합니다. 음료를 구매할 수 없습니다.");
        }

        scanner.close();

    }
}

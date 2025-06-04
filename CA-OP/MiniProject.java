/**
 * # 주석을 보고 직접 코드를 완성해 보세요!
 * 자판기 시뮬레이션 프로그램
 *
 * (1) 음료 메뉴를 출력하고, 사용자가 금액을 입력한다.
 * (2) 음료를 번호로 선택한다.
 * (3) 선택한 음료의 가격과 투입 금액을 비교하여 구매 여부를 판단한다.
 * (4) 잔액이 충분하면 구매 완료 메시지 + 잔액 출력
 * (5) 잔액이 부족하면 구매 불가 메시지를 출력한다.
 * (6) switch문과 if문을 함께 사용하여 조건을 처리해보자.
 */

import java.util.Scanner;

public class MiniProject {
    public static void main(String[] args) {
        // (1) Scanner 객체 생성
        Scanner scanner = new Scanner(System.in);

        // (2) 음료 메뉴 출력
        System.out.println("음료 메뉴:");
        System.out.println("1. 아메리카노 - 3000원");
        System.out.println("2. 카페라떼 - 3500원");
        System.out.println("3. 카푸치노 - 4000원");
        System.out.println("4. 에스프레소 - 2500원");

        // (3) 금액 입력 받기
        System.out.print("투입 금액을 입력하세요: ");
        int money = scanner.nextInt();

        // (4) 음료 선택 받기
        System.out.print("음료를 선택하세요 (1~4): ");
        int choice = scanner.nextInt();

        int price = 0;  // 음료 가격 초기값

        // (5) 선택한 번호에 따라 가격 설정 (switch문 사용)
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
                // 잘못된 번호 입력 시 안내 후 종료
                System.out.println("잘못된 선택입니다.");
                scanner.close();
                return;
        }

        // (6) 잔액 비교 (if문 사용)
        if (money >= price) {
            System.out.println("선택한 음료를 구매했습니다. 잔액: " + (money - price) + "원");
        } else {
            System.out.println("잔액이 부족합니다. 음료를 구매할 수 없습니다.");
        }

        // (7) Scanner 닫기
        scanner.close();
    }
}

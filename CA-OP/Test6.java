/**
 * # 주석을 따라 직접 코드를 이해하고 작성해보세요!
 * 배열에서 최대값, 최소값, 평균값, 중앙값 구하기
 *
 * (1) 정수 배열 numbers가 주어졌을 때,
 *     - 최대값: 가장 큰 값
 *     - 최소값: 가장 작은 값
 *     - 평균값: 전체 합 ÷ 개수
 *     - 중앙값: 정렬된 배열에서 가운데 값
 *
 * (2) 향상된 for문과 조건문을 활용해서 각각의 값을 구해보자.
 */

import java.util.Arrays;

public class Test6 {
    public static void main(String[] args) {
        // (1) 정수 배열 선언
        int[] numbers = { 3, 5, 1, 8, 2 };

        // 배열이 비어 있는지 확인
        if (numbers.length == 0) {
            System.out.println("배열이 비어 있습니다.");
            return;
        }

        // (2) 최대값과 최소값 구하기
        int max = numbers[0];  // 기준값 설정
        int min = numbers[0];

        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
        }

        // (3) 평균값 구하기
        double sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        double average = sum / numbers.length;

        // (4) 중앙값 구하기
        Arrays.sort(numbers);  // 배열 정렬
        double median;

        if (numbers.length % 2 == 0) {
            // 짝수일 경우: 가운데 두 수의 평균
            median = (numbers[numbers.length / 2 - 1] + numbers[numbers.length / 2]) / 2.0;
        } else {
            // 홀수일 경우: 가운데 값
            median = numbers[numbers.length / 2];
        }

        // (5) 결과 출력
        System.out.println("결과:");
        System.out.println("최대값: " + max);
        System.out.println("최소값: " + min);
        System.out.println("평균값: " + average);
        System.out.println("중앙값: " + median);

        System.out.println("프로그램이 종료되었습니다.");
    }
}

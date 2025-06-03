public class Test6 {
    public static void main(String[] args) {
        // 최대값 최소값 구하기
        int[] numbers = { 3, 5, 1, 8, 2 };
        if (numbers.length == 0) {
            System.out.println("배열이 비어 있습니다.");
            return;
        }
        int max = numbers[0];
        int min = numbers[0];
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
        }
        System.out.println("최대값: " + max);
        System.out.println("최소값: " + min);
        
        // 평균값 구하기
        double sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        double average = sum / numbers.length;
        System.out.println("평균값: " + average);
        
        // 중앙값 구하기
        java.util.Arrays.sort(numbers);
        double median;

        if (numbers.length % 2 == 0) {
            median = (numbers[numbers.length / 2 - 1] + numbers[numbers.length / 2]) / 2.0;
        } else {
            median = numbers[numbers.length / 2];
        }

        System.out.println("중앙값: " + median);
        
        // 결과 출력
        System.out.println("결과:");
        System.out.println("최대값: " + max);
        System.out.println("최소값: " + min);

        System.out.println("평균값: " + average);
        System.out.println("중앙값: " + median);

        System.out.println("프로그램이 종료되었습니다.");

    }
}

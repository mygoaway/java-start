package array;

public class EnhancedFor1 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        // 일반 for문
        for(int i = 0; i < numbers.length; i++){
            System.out.println("number = " + numbers[i]);
        }

        // 향상된 for문, for-each문 => 단, for-each문의 경우에는 index 값을 사용하는 경우에는 불가하다.
        for (int number : numbers) {
            System.out.println("number = " + number);
        }
    }
}

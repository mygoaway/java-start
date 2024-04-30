package array.ex;

import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args) {
        int sum = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("입력받을 숫자의 개수를 입력하세요:");
        int num = scanner.nextInt();
        int[] numbers = new int[num];
        int minNumber = 0;
        int maxNumber = 0;


        System.out.println(num +"개의 정수를 입력하세요");
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        minNumber = maxNumber = numbers[0];
        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] > maxNumber) {
                maxNumber = numbers[i];
            }

            if(numbers[i] < minNumber) {
                minNumber = numbers[i];
            }
        }

        System.out.println("가장 작은 숫자 : " + minNumber);
        System.out.println("가장 큰 숫자: " + maxNumber);
    }
}

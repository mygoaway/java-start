package scanner;

import java.util.Scanner;

public class ScannerWhile3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        while (true) {
            System.out.print("정수를 입력하세요 (0을 입력하면 프로그램 종료) ");
            int intValue = scanner.nextInt();
            sum += intValue;

            if(intValue == 0) {
                break;
            }
            System.out.println("사용자가 입력한 총 합 : " + sum);
        }
    }
}

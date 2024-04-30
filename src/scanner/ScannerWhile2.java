package scanner;

import java.util.Scanner;

public class ScannerWhile2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("첫 번째 숫자와 두 번째 숫자 모두 0을 입력하면 프로그램을 종료합니다.");
        while (true) {
            System.out.print("첫 번째 숫자를 입력해주세요: ");
            int intValue1 = scanner.nextInt();
            System.out.print("첫 번째 숫자를 입력해주세요: ");
            int intValue2 = scanner.nextInt();

            if(intValue1 == 0 && intValue2 == 0) {
                System.out.println("프로그램 종료");
                break;
            }
            System.out.println("intValue1 = " + intValue1 + ", intValue1 = " + intValue2);
        }
    }
}

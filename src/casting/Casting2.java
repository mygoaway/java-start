package casting;

public class Casting2 {
    public static void main(String[] args) {
        // 명시적 형변환 범위가 큰 타입을 작은 타입으로 변경하는 경우
        double doubleValue = 1.5;
        int intValue = 0;

        //intValue = doubleValue; // 컴파일 오류 발생
        intValue = (int) doubleValue; // 형변환
        System.out.println("intValue = " + intValue);
    }
}

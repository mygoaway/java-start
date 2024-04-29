package casting;

public class Casting3 {
    public static void main(String[] args) {
        long maxIntValue = 2147483647; // int 최고값
        long maxIntOverValue = 2147483648L; // int 최고값

        // long -> int로 변환하는 경우에는 명시적 형변환으로 처리해야 함
        // 단, long에서 int로 명시적 변환하는 경우에 범위가 초과되면 어떻게 될까?
        // 결과를 보면 -2147483648이라는 전혀 다른 숫자가 보인다. => 오버플로우
        // 오버플로우가 발생하면 마치 시계가 한바퀴 돈 것처럼 다시 처음부터 시작한다.
        int intValue;
        intValue = (int)maxIntValue;
        System.out.println("intValue1 = " + intValue);
        intValue = (int)maxIntOverValue;
        System.out.println("intValue2 = " + intValue);
    }
}

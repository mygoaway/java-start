package method;

public class Method1Ref {
    public static void main(String[] args) {
        // 계산 1
        int sum1 = add(3, 4);
        System.out.println("결과1 출력 = " + sum1);

        // 계산 2
        int sum2 = add(15, 20);
        System.out.println("결과2 출력 = " + sum2);
    }

    // add 메서드
    public static int add(int a, int b) {
        System.out.println(a + "+" + b + " 연산 수행");
        return a + b;
    }
}

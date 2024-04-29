package scope;

public class Scope1 {
    public static void main(String[] args) {
        // 이렇게 변수의 접근 가능한 범위를 스코프(Scope)라 한다.
        // 변수의 스코프는 꼭 필요한 곳으로 한정해서 사용하자. 메모리 효율적으로 사용 더 유지보수하기 좋은 코드
        int m = 10; // m 생존 시작

        if(true) {
            int x = 100; // x 생존 시작
            System.out.println("if m = " + m);
            System.out.println("if x = " + x);
        } // x 생존 종료
        //System.out.println("main x = " + x);
        System.out.println("main m = " + m);
    } // m 생존 종료
}

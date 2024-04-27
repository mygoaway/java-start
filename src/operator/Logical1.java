package operator;

public class Logical1 {
    public static void main(String[] args) {
        // 논리연산자 1
        // 1. && AND 연산
        System.out.println(true && true); // true
        System.out.println(true && false); // false
        System.out.println(false && false); // true

        // 2. || OR 연산
        System.out.println(true || true); // true
        System.out.println(true || false); // true
        System.out.println(false || false); // false

        // 3. ! 연산
        System.out.println(!true); // false
        System.out.println(!false); // true
    }
}

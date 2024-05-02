package method.ex;

public class MethodEx1 {
    public static void main(String[] args) {
        double result1 = calculateAverage(1, 2, 3);
        System.out.println("첫 번째 학생의 평균 = " + result1);

        double result2 = calculateAverage(15, 25, 35);
        System.out.println("두 번째 학생의 평균 = " + result2);
    }

    public static double calculateAverage(int a, int b, int c) {
        return a + b + c / 3.0;
    }
}

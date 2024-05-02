package method.overloding;

public class Overloading2 {
    public static void main(String[] args) {
        int result1 = add(2, 3);
        System.out.println("result1 = " + result1);

        double result2 = add(1.5, 2);
        System.out.println("result2 = " + result2);
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static double add(double a, int b) {
        return a + b;
    }
}

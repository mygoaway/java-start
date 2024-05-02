package method.overloding;

public class Overloading3 {
    public static void main(String[] args) {
        int result1 = add(2, 3);
        System.out.println("result1 = " + result1);

        double result3 = add(1.5, 2.5);
        System.out.println("result3 = " + result3);
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }
}

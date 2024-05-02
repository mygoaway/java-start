package method;

public class MethodReturn1 {
    public static void main(String[] args) {
        boolean result1 = odd(2);
        System.out.println("result1 = " + result1);

        boolean result2 = odd(3);
        System.out.println("result2 = " + result2);
    }


    public static boolean odd(int i) {
        if( i % 2 == 1) {
            return true;
        } else {
            return false;
        }
    }
}

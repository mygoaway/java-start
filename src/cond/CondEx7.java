package cond;

public class CondEx7 {
    public static void main(String[] args) {
        int intVal = 2;

        String result = intVal % 2 == 0 ? "짝수" : "홀수";
        System.out.println("intVal = " + intVal + ", " + result);
    }
}

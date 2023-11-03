public class RecursiveMultiply {
    public static int multiply(int a, int b) {
        if (b == 0) {
            return 0;
        }

        if (b % 2 == 0) {
            int halfProduct = multiply(a, b / 2);
            return halfProduct + halfProduct;
        } else {
            int halfProduct = multiply(a, b / 2);
            return halfProduct + halfProduct + a;
        }
    }

    public static void main(String[] args) {
        int num1 = 7;
        int num2 = 4;
        int result = multiply(num1, num2);
        System.out.println("Result: " + result);
    }
}

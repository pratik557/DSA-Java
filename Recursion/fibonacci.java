public class fibonacci {
    static int fibo(int n) {
        if (n == 1 || n == 2) {
            return n - 1;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }

    public static void main(String[] args) {
        int m = 7;
        int result = 0;
        result = fibo(m);
        System.out.println("The fibonacci series is " + result);
    }
}

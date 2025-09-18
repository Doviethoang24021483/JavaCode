import java.util.*;

public class Solution {
    public static long fibonacci(long n) {
        if(n<0) return -1;
        if(n==0) return 0;
        if(n==1) return 1;

        long a = 0;
        long b = 1;
        long c = 0;

        for (int i = 2; i <= n ; i++) {
            if(Long.MAX_VALUE - b < a) {
                return Long.MAX_VALUE;
            }
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(fibonacci(n));
        sc.close();
    }
}
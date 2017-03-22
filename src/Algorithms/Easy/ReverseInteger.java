package Algorithms.Easy;

/**
 * Created by Wags on 3/21/17.
 */
public class ReverseInteger {
    public static void main(String[] args) {
        int x = 123;
        System.out.print(reverse(x));


    }

    /**
     * Reverse digits of an integer.
     * <p/>
     * Example1: x = 123, return 321
     * Example2: x = -123, return -321
     * <p/>
     * RUNTIME: O(N)
     *
     * @param x
     * @return
     */
    public static int reverse(int x) {
        long r = 0;
        while (x != 0) {
            r = r * 10 + x % 10;
            x /= 10;
            if (r > Integer.MAX_VALUE || r < Integer.MIN_VALUE) {
                return 0;
            }
        }
        return (int) r;
    }

}

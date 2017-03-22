package Algorithms.Easy;

/**
 * Created by Wags on 3/21/17.
 */
public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.print(isPalindrome(4554));
    }

    /**
     * Determine whether an integer is a palindrome. Do this without extra space.
     *
     * @param x
     * @return
     */
    public static boolean isPalindrome(int x) {
        if (x < 0 || (x != 0 && x % 10 == 0)) {
            return false;
        }
        int r = 0;
        while (x>r) {
            r = r * 10 + x % 10;
            x = x / 10;
        }
        return (x == r || x == r / 10);
    }
}

package Algorithms.Easy;

/**
 * Created by Wags on 3/21/17.
 */
public class RomanToInteger {
    public static void main(String[] args) {
        System.out.print(romanToInt("MMMDLXXXVI"));
    }

    /**
     * Convert String to Integer
     *
     * RUNTIME: O(N)
     * @param s
     * @return
     */
    public static int romanToInt(String s) {
        int sum = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            switch (s.charAt(i)) {
                case 'I':
                    sum += (sum >= 5 ? -1 : 1);
                    break;
                case 'V':
                    sum += 5;
                    break;
                case 'X':
                    sum += 10 * (sum >= 50 ? -1 : 1);
                    break;
                case 'L':
                    sum += 50;
                    break;
                case 'C':
                    sum += 100 * (sum >= 500 ? -1 : 1);
                    break;
                case 'D':
                    sum += 500;
                    break;
                case 'M':
                    sum += 1000;
                    break;
            }
        }
        return sum;
    }
}

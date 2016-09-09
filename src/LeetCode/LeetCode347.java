package LeetCode;

/**
 * Created by t-tiyou on 9/9/2016.
 */
public class LeetCode347 {
    /* The guess API is defined in the parent class GuessGame.
   @param num, your guess
   @return -1 if my number is lower, 1 if my number is higher, otherwise return 0
      int guess(int num); */

    class GuessGame {

    }

    public class Solution extends GuessGame {
        public int guess(int num) {
            return 0;
        }

        public int guessNumber(int n) {
            return gu(0, n);
        }

        public int gu(int left, int right) {
            int middle = left + (right - left) / 2;
            if (guess(middle) > 0) {
                left = middle + 1;
                return gu(left, right);
            }
            if (guess(middle) < 0) {
                right = middle - 1;
                return gu(left, right);
            }
            if (guess(middle) == 0) {
                return middle;
            }
            return -1;
        }
    }
}

package LeetCode;

/**
 * Created by youti on 2016/9/22.
 */
public class LeetCode223 {
    public static void main(String[] args) {
        Solution test = new Solution();
        test.computeArea(-2, -2, 2, 2, -2, -2, 2, 2);
    }

    public static class Solution {
        public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
            int areaA = (D - B) * (C - A);
            int areaB = (H - F) * (G - E);
            int a = (B > F ? B : F);
            int b = (D < H ? D : H);
            int c = (A > E ? A : E);
            int d = (C < G ? C : G);
            int both = 0;
            if (b > a && d > c) {
                both = (b - a) * (d - c);
            }
            return areaA + areaB - both;
        }
    }
}

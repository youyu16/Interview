package LeetCode;

/**
 * Created by t-tiyou on 9/11/2016.
 */
public class LeetCode70 {
    public class Solution {
        public int firstBadVersion(int n) {
            int start = 1, end = n;
            while (start < end) {
                int mid = start + (end - start) / 2;
                if (!isBadVersion(mid)) start = mid + 1;
                else end = mid;
            }
            return start;
        }

        private boolean isBadVersion(int mid) {
            if(mid==1){
                return true;
            }
            else{
                return false;
            }
        }
    }
}

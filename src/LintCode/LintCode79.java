package LintCode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by t-tiyou on 9/1/2016.
 */

public class LintCode79 {

    public static void main(String[] args) {
        LintCode79 test = new LintCode79();
        //test.longestCommonSubstring("abccccccccccde", "dbccccccabccde");
        test.getLCString("www.lintcode.com code", "www.ninechapter.com code");
    }

    /**
     * @param A, B: Two string.
     * @return: the length of the longest common substring.
     * 复杂度O(n*m*m)
     */
    public int longestCommonSubstring(String A, String B) {
        // write your code here
        if (A == null || B == null)
            return 0;
        char[] a = A.toCharArray();
        char[] b = B.toCharArray();
        char[] max = (a.length > b.length ? a : b);
        char[] min = (a.length <= b.length ? a : b);
        int result = 0;
        for (int i = 0; i < max.length; i++) {
            for (int j = 0; j < min.length; j++) {
                int temp1 = i;
                int temp2 = j;
                List<Character> cList = new ArrayList<>();
                while (min[temp2] == max[temp1]) {
                    cList.add(min[temp2]);
                    temp1++;
                    temp2++;
                    if (temp2 == min.length || temp1 == max.length)
                        break;
                }
                if (cList.size() > result)
                    result = cList.size();
            }
        }
        return result;
    }

    /**
     * 时间复杂度O(n*m)
     */
    public int getLCString(String A, String B) {
        char[] str1 = A.toCharArray();
        char[] str2 = B.toCharArray();
        int i, j;
        int len1, len2;
        len1 = str1.length;
        len2 = str2.length;
        int maxLen = len1 > len2 ? len1 : len2;
        int[] max = new int[maxLen];
        int[] maxIndex = new int[maxLen];
        int[] c = new int[maxLen]; // 记录对角线上的相等值的个数

        for (i = 0; i < len2; i++) {
            for (j = len1 - 1; j >= 0; j--) {
                if (str2[i] == str1[j]) {
                    if ((i == 0) || (j == 0))
                        c[j] = 1;
                    else
                        c[j] = c[j - 1] + 1;
                } else {
                    c[j] = 0;
                }

                if (c[j] > max[0]) { // 如果是大于那暂时只有一个是最长的,而且要把后面的清0;
                    max[0] = c[j]; // 记录对角线元素的最大值，之后在遍历时用作提取子串的长度
                    maxIndex[0] = j; // 记录对角线元素最大值的位置

                    for (int k = 1; k < maxLen; k++) {
                        max[k] = 0;
                        maxIndex[k] = 0;
                    }
                } else if (c[j] == max[0]) { // 有多个是相同长度的子串
                    for (int k = 1; k < maxLen; k++) {
                        if (max[k] == 0) {
                            max[k] = c[j];
                            maxIndex[k] = j;
                            break; // 在后面加一个就要退出循环了
                        }

                    }
                }
            }
        }

        for (j = 0; j < maxLen; j++) {
            if (max[j] > 0) {
                System.out.println("第" + (j + 1) + "个公共子串:");
                for (i = maxIndex[j] - max[j] + 1; i <= maxIndex[j]; i++)
                    System.out.print(str1[i]);
                System.out.println(" ");
                return max[j];
            }
        }
        return 0;
    }
}
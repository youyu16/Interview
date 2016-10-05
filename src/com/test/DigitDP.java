package com.test;

/**
 * Created by t-tiyou on 9/30/2016.
 */
public class DigitDP {

    public static int N = 25;
    public static int digit[] = new int[N];
    public static long dp[][] = new long[N][N];


    public static void main(String[] args) {


    }

    public static long dfs(int pos, int statu, boolean limit) {
        int i, end, s;
        long res = 0;
        if (pos == -1)
            return 1;
        if (!limit && dp[pos][statu] != -1)
            return dp[pos][statu];

        end = limit ? digit[pos] : 9;
        for (i = statu; i <= end; i++)
            res += dfs(pos - 1, i, limit && i == end);
        if (!limit)
            dp[pos][statu] = res;
        return res;
    }
}

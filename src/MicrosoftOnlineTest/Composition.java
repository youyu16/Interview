package MicrosoftOnlineTest;

import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by t-tiyou on 10/10/2016.
 */
public class Composition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<String> set = new HashSet<>();
        while (sc.hasNext()) {
            int n = sc.nextInt();
            String s = sc.next();
            int m = sc.nextInt();
            for (int i = 0; i < m; i++) {
                set.add(sc.next());
            }

            int[][] f = new int[n + 2][27];

            for (int i = 0; i < 26; i++) {
                for (int j = 0; j < n; j++) {
                    f[j][i] = Integer.MAX_VALUE - 1;
                }
            }

            f[0][s.charAt(0) - 'a'] = 0;
            for (int i = 1; i < n; i++) {
                f[i][s.charAt(i) - 'a'] = i;
                for (int x = 0; x < 26; x++) {
                    if (isOK((char) (x + 'a'), s.charAt(i), set)) {
                        f[i][s.charAt(i) - 'a'] = Math.min(f[i][s.charAt(i) - 'a'], f[i - 1][x]);
                    }

                    f[i][x] = Math.min(f[i][x], f[i - 1][x] + 1);
                }

            }
            int ans = Integer.MAX_VALUE;
            for (int i = 0; i < 26; i++) {
                ans = Math.min(ans, f[n - 1][i]);
            }
            System.out.println(ans);
        }
        sc.close();
    }

    private static boolean isOK(char a, char b, HashSet<String> set) {
        String s1 = a + "";
        String s2 = b + "";
        if (set.contains(s1 + s2) || set.contains(s2 + s1))
            return false;
        return true;
    }
}
package LeetCode;

import java.util.*;

/**
 * Created by t-tiyou on 10/26/2016.
 */
public class LeetCode406 {

    public static void main(String[] args) {
        int[][] test = new int[][]{{5, 0}, {7, 0}, {5, 2}, {6, 1}, {4, 4}, {7, 1}};
        Solution.reconstructQueue(test);
    }

    public static class Solution {
        public static int[][] reconstructQueue(int[][] people) {
            if (people.length == 0) return new int[][]{};

            //sort
            Arrays.sort(people, new mC());

            //put in a list
            List<int[]> list = new LinkedList<>();
            list.add(people[0]);
            for (int i = 1; i < people.length; i++) {
                list.add(people[i][1], people[i]);
            }
            for (int i = 0; i < people.length; i++) {
                people[i] = list.get(i);
            }
            return people;
        }

        static class mC implements Comparator<int[]> {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] > o2[0]) return -1;
                else if (o1[0] < o2[0]) return 1;
                else {
                    return o1[1] - o2[1];
                }
            }
        }
    }
}

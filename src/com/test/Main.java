package com.test;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int max = 0;
            int[] weight = new int[n + 1];
            HashSet<Integer> leftSet = new HashSet<>();
            for (int i = 1; i <= n; i++) {
                weight[i] = sc.nextInt();
                max += weight[i];
                leftSet.add(i);
            }
            HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
            for (int i = 0; i < n - 1; i++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                AddToMap(map, a, b);
                AddToMap(map, b, a);
            }
            HashSet<Integer> resultSet = new HashSet<>();
            HashSet<Integer> nearBySet = new HashSet<>();
            int currentWeight = 0;
            for (int i = 0; i < m && currentWeight < max; i++) {
                int num = -1;
                int wei = 0;
                for (Integer room : leftSet) {
                    int temp = 0;
                    if (!resultSet.contains(room)&&(!nearBySet.contains(room))) {
                        temp += weight[room];
                    }
                    for (Integer nearBy : map.get(room)) {
                        if (!nearBySet.contains(nearBy)&&(!resultSet.contains(nearBy))) {
                            temp += weight[nearBy];
                        }
                    }
                    if (temp > wei) {
                        wei = temp;
                        num = room;
                    }
                }
                resultSet.add(num);
                nearBySet.addAll(map.get(num));
                leftSet.remove(num);
                currentWeight += wei;
            }
            for (Integer integer : resultSet) {
                System.out.println(integer);
            }
            System.out.println(currentWeight);
        }
        sc.close();
    }

    public static void AddToMap(HashMap<Integer, ArrayList<Integer>> map, int a, int b) {
        if (!map.containsKey(a)) {
            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(b);
            map.put(a, temp);
        }
        if (map.containsKey(a) && (!map.get(a).contains(b))) {
            map.get(a).add(b);
        }
    }

}

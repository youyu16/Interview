package com.test;

import java.util.*;

public class Main {
    public static void main(String[] args) {


    }

    public int FindGreatestSumOfSubArray(int[] array) {
        if(array.length==0){
            return 0;
        }

        int count = array[0];
        int max = Integer.MIN_VALUE;
        for (int i = 1; i < array.length; i++) {
            if(count>0)
                count+=array[i];
            else
                count=array[i];
            if(count>max)
                max = count;
        }
        return max;
    }

}

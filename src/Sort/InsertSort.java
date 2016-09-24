package Sort;

/**
 * Created by youti on 2016/9/24.
 */
public class InsertSort {

    public static void sort(int[] array) {
        int temp = 0;
        for (int i = 1; i < array.length; i++) {
            int j = i - 1;
            temp = array[i];
            for (; j >= 0 && temp < array[j]; j--) {
                //将大于temp的值整体后移一个单位
                array[j + 1] = array[j];
            }
            array[j + 1] = temp;
        }
    }
}

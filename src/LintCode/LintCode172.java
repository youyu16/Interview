package LintCode;

/**
 * Created by t-tiyou on 9/2/2016.
 */
public class LintCode172 {
    public static void main(String[] args) {
        LintCode172 test = new LintCode172();
        int[] a = {0, 4, 4, 0, 4, 4, 4, 0, 2};
        test.removeElement(a, 4);
    }

    /**
     * @param A:    A list of integers
     * @param elem: An integer
     * @return: The new length after remove
     */
    public int removeElement(int[] A, int elem) {
        // write your code here
        int deleted = 0;
        for (int i = 0; i < A.length; ) {
            if (A[i] == elem) {
                for (int j = i; j < A.length; j++) {
                    if (j < A.length - 1)
                        A[j] = A[j + 1];
                }
                deleted++;
            }
            else{
                i++;
            }
            if(deleted==A.length)
                break;
        }
        return A.length - deleted;
    }
}

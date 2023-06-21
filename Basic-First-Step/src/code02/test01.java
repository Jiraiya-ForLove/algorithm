package code02;

/**
 * @program: Basic-First-Step
 * @description:
 * @author: shenhaha
 * @create: 2023-06-09 19:22
 **/

public class test01 {
    public static void main(String[] args) {
        int[] testArr = new int[]{-1, 2, 6, 7, 22, 67};
        int[] ints = prefixArr(testArr);
        System.out.println(rangeSum(ints, 2, 3));
    }

    /**
     * 提供任意一个数组，生成前缀和数组
     *
     * @param arr
     * @return
     */
    public static int[] prefixArr(int[] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }
        int N = arr.length;
        int[] preSumArr = new int[N];
        for (int i = 0; i < preSumArr.length; i++) {
            if (i == 0) {
                preSumArr[i] = arr[0];
            } else {
                preSumArr[i] = preSumArr[i - 1] + arr[i];
            }
        }
        return preSumArr;
    }

    /**
     * 求连续区间的和
     *
     * @param arr   代表所求数组的前缀和数组
     * @param left
     * @param rigth
     * @return
     */
    public static int rangeSum(int[] arr, int left, int rigth) {
        if (arr == null || arr.length == 0) {
            return 0;
        }
        return left == 0 ? arr[rigth] : arr[rigth] - arr[left - 1];
    }
}

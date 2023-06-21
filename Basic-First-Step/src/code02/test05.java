package code02;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

/**
 * @program: Basic-First-Step
 * @description: 对数器的验证作用
 * @author: shenhaha
 * @create: 2023-06-16 18:52
 **/

public class test05 {

    public static void swap(int[] arr, int num1, int num2) {
        int tem = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = tem;
    }

    /**
     * 选择排序
     */
    public static void selectInsert(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        int N = arr.length - 1;
        for (int i = 0; i < N; i++) {
            int minVlaueIndex = i;
            //这里的for循环找出当前序列中最小值的索引
            for (int j = i + 1; j <= N; j++) {
                minVlaueIndex = (arr[minVlaueIndex] > arr[j]) ? j : minVlaueIndex;
            }
            swap(arr, minVlaueIndex, i);
        }
    }

    /**
     * 冒泡排序
     *
     * @param arr
     */
    public static void bubbleSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        int N = arr.length - 1;//数组最后的索引
        for (int end = N; end >= 1; end--) {
            for (int prior = 0; prior < end; prior++) {
                if (arr[prior] >= arr[prior + 1]) {
                    swap(arr, prior, prior + 1);
                }
            }
        }
    }

    /**
     * 插入排序
     *
     * @param arr
     */
    public static void insertSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        int N = arr.length - 1;
        for (int i = 1; i <= N; i++) {
            int minValueIndex = i;
            while (minValueIndex - 1 >= 0 && arr[minValueIndex] <= arr[minValueIndex - 1]) {
                swap(arr, minValueIndex - 1, minValueIndex);
                minValueIndex--;
            }

        }
    }

    /**
     * 返回一个数组arr，arr长度[0,maxLen-1],数组元素的取值[0,maxValue-1]
     *
     * @param maxLen
     * @param maxValue
     * @return
     */
    public static int[] lenRandomValueRandom(int maxLen, int maxValue) {
        int len = ((int) (Math.random() * maxLen)); //[0,maxLen-1]
        int[] res = new int[len];
        for (int i = 0; i < res.length; i++) {
            res[i] = ((int) (Math.random() * maxValue));
        }
        return res;
    }

    /**
     * 创建一个数组的副本
     *
     * @param arr
     * @return
     */
    public static int[] copyArray(int[] arr) {
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            res[i] = arr[i];
        }
        return res;
    }

    /**
     * 验证当前数组是否为有序的(从小到大、从大到小)
     *
     * @param arr
     * @return
     */
    public static boolean arrayIsOrder(int[] arr) {
        if (arr.length <= 1) {
            return true;
        }
        int postiveCount = 0;
        int negativeCount = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] - arr[i + 1] <= 0) {
                negativeCount++;
            }
            if (arr[i] - arr[i + 1] >= 0) {
                postiveCount++;
            }
        }

        if (negativeCount == arr.length - 1 || postiveCount == arr.length - 1) {
            return true;
        } else {
            return false;
        }
    }



    public static void main(String[] args) {
        int maxLen = 50;
        int maxValue = 1000;
        int testTimes = 10000;
        for (int i = 0; i < testTimes; i++) {
            int[] arr1 = lenRandomValueRandom(maxLen, maxValue);
            int[] arr2 = copyArray(arr1);
            selectInsert(arr1);
            if (!arrayIsOrder(arr1)) {
                for (int i1 : arr2) {
                    System.out.print(i1);
                }
                System.out.println();
                System.out.println("选择排序错了！！！");
                break;
            }
        }

    }
}

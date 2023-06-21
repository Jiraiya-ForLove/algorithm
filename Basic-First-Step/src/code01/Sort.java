package code01;

/**
 * @program: Basic-First-Step
 * @description:
 * @author: shenhaha
 * @create: 2023-06-06 08:44
 **/

public class Sort {
    public static void main(String[] args) {
        //待排序序列
        int[] arr = {3, 5, 1, 10, 56, 8};
        print(arr);
        insertSort2(arr);
        System.out.println();
        print(arr);
    }

    /**
     * 选择排序
     *
     * @param arr
     */
    public static void selectSort(int[] arr) {

        if (arr == null || arr.length < 2) {
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            int minVlaueIndex = i;//记录最小值的索引
            for (int j = i + 1; j < arr.length; j++) {
                minVlaueIndex = (arr[minVlaueIndex] <= arr[j]) ? minVlaueIndex : j;
            }
            swap(arr, i, minVlaueIndex);
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
        int N = arr.length;
        //0-n-1  0-n-2  0-n-3 ... 0-1
        for (int end = N - 1; end > 0; end--) {
            //0~end 上干一坨事
            //每一轮循环要做的事: 01 12 23 34 n-1 n   两两比较
            for (int fisrt = 0; fisrt <= end - 1; fisrt++) {
                if (arr[fisrt] >= arr[fisrt + 1]) {
                    swap(arr, fisrt, fisrt + 1);
                }
            }
        }
    }

    /**
     * 插入排序v1.0
     *
     * @param arr
     */
    public static void insertSort1(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        int N = arr.length;
        //0-0 已经排序好了  0-1  0-2  0-3 0-4  0-N-1
        for (int end = 1; end <= N - 1; end++) {
            int minValueIndex = end;
            while (minValueIndex - 1 >= 0 && arr[minValueIndex] < arr[minValueIndex - 1]) {
                swap(arr, minValueIndex, minValueIndex - 1);
                minValueIndex--;
            }
        }
    }

    /**
     * 插入排序2.0
     *
     * @param arr
     */
    public static void insertSort2(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        int N = arr.length - 1;
        // 0-1  0-2 0-3  ... 0-最后一个数(N)
        for (int end = 1; end <= N; end++) {
            //
            for (int minValueIndex = end; (minValueIndex - 1) >= 0 && arr[minValueIndex] <= arr[minValueIndex - 1]; minValueIndex--) {
                swap(arr,minValueIndex,minValueIndex-1);
            }
        }
    }

    /**
     * 交换2个数
     *
     * @param arr
     * @param i
     * @param j
     */
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    /**
     * 打印数组中的内容
     *
     * @param arr
     */
    public static void print(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

}

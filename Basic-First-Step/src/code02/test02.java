package code02;

/**
 * @program: Basic-First-Step
 * @description:
 * @author: shenhaha
 * @create: 2023-06-09 22:58
 **/

public class test02 {
    public static void main(String[] args) {
        int[] arr = {3,4,2,1,6,7,8};
        int[][] indexTable = indexTable(arr);
        System.out.println(findFromIndexTable(indexTable, 1, 3));
    }

    /**
     * 生成一个二维数组
     * @param arr
     * @return
     */
    public static int[][] indexTable(int[] arr){
        if (arr == null || arr.length == 0){
            return null;
        }
        int N = arr.length;
        int[][] res = new int[N][N];
        //left:纵向的轴  right：横向的轴
        for (int left = 0; left < res.length; left++) {
            for (int right = 0;right < res[left].length;right++){
                //1-0 2-0 2-1 ...这类情况直接置为-1，代表不存在值
                if (left > right){
                    res[left][right] = -1;
                }
                if (left == right){
                    res[left][right] = arr[left];
                }
                if (left < right){
                    res[left][right] = res[left][right-1]+arr[right];
                }
            }
        }
        return res;
    }

    /**
     *
     * @param indexTable 所求连续区间的和的数组所生成的二维表
     * @param left 左边区间
     * @param right 右边区间
     * @return
     */
    public static int findFromIndexTable(int[][] indexTable,int left,int right){
        if (indexTable == null || indexTable.length == 0){
            return -1;
        }
        return indexTable[left][right];
    }
}

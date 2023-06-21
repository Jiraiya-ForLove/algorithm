package code01;

/**
 * @program: Basic-First-Step
 * @description:
 * @author: shenhaha
 * @create: 2023-06-04 20:27
 **/

public class Problem01 {
    public static void main(String[] args) {
        int factorial = factorial01(3);
        System.out.println(factorial);
    }

    public static int factorial01(int N) {
        int result = 0;
        if (N == 0) {
            return 0;
        } else {
            for (int i = 1; i <= N; i++) {
                int multipleRes = 1;
                for (int j = 1; j <= i; j++) {
                    multipleRes = multipleRes * j;
                }
                result += multipleRes;
            }
            return result;
        }
    }

    public static long factorial02(int N){
        long ans = 0;//存放最终的结果
        long res = 1;//存放每一次阶乘的结果
        for (int i = 1; i <N; i++) {
            res = res * i;//计算每一次阶乘的结果
            ans = ans + res;//累加
        }
        return res;
    }
}

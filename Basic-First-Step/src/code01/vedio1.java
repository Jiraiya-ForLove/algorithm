package code01;

/**
 * @program: algorithm
 * @description: 位运算
 * @author: shenhaha
 * @create: 2023-06-03 22:01
 **/

public class vedio1 {
    public static void main(String[] args) {
        int a = -5;
//        int b = -a;
        int b = (~ a) + 1;
        System.out.println(a);
        System.out.println(b);
        print(a);
        print(b);

        //对于负数的最小值，如果取其相反数，与其本身一致。
        int min = Integer.MIN_VALUE;
        int min_pos = (~ min)+1;
        System.out.println(min);
        System.out.println(min_pos);
        print(min);
        print(min_pos);
    }

    /**
     * 将整数转化对应的32位二进制
     *(包括正负数以及0)
     * @param num
     */
    public static void print(int num) {
        for (int i = 31; i >= 0; i--) {
            System.out.print((num & (1 << i)) == 0 ? '0' : "1");
        }
        System.out.println();
    }
}

package code02;

/**
 * @program: Basic-First-Step
 * @description:
 * @author: shenhaha
 * @create: 2023-06-13 23:14
 **/

public class test04 {
    public static void main(String[] args) {
//        int cycleCount = 100000;
//        int count;
//        int[] counts = new int[8];
//        count = 0;
//        for (int i = 0; i < cycleCount; i++) {
//            counts[f4()]++;
//        }
//        for (int i = 0; i < 8; i++) {
//            System.out.println(counts[i]);
//        }
//        int y = y();
//        System.out.println(y);
        String s1 = "hello";
        String s2 = "hello";
        String s3 = new String("hello");
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
    }

    /**
     * 实现{1，2，3，4，5}等概率
     *
     * @return
     */
    public static int f() {
        return (int) (Math.random() * 5) + 1;
    }

    /**
     * 实现{0,1}等概率
     *
     * @return
     */
    public static int f1() {
        int ans;
        do {
            ans = f();
        } while (ans == 3);
        return (ans < 3) ? 0 : 1;
    }

    /**
     * 实现【0，。。。，7】上等概率
     *
     * @return
     */
    public static int f2() {
        int ans = (f1() << 2) + (f1() << 1) + (f1() << 0);
        return ans;
    }

    /**
     * 因为最终目的:【1，7】 7-1=6   先实现[0,...,6]等概率
     *
     * @return
     */
    public static int f3() {
        int ans;
        do {
            ans = f2();
        } while (ans == 7);
        return ans;
    }

    /**
     * 实现【1，。。。，7】等概率
     *
     * @return
     */
    public static int f4() {
        return f3() + 1;
    }


    /**
     * 01 不等概率
     *
     * @return
     */
    public static int x() {
        return Math.random() < 0.84 ? 0 : 1;
    }

    /**
     * 01 等概率返回
     *
     * @return
     */
    public static int y() {
        int ans;
        int[] ans1 = new int[0];
//        String
//        ans1[0] = 1;
        System.out.println(ans1[0]);
        do {
            ans = x();
        } while (ans == x()); //代表 ans=1 x()第二次取值还是1；ans=0 x()第二次取值还是0 那么还得再进入循环
        return ans;
    }
}

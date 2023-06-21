package code02;

/**
 * @program: Basic-First-Step
 * @description:
 * @author: shenhaha
 * @create: 2023-06-11 22:52
 **/

public class test03 {
    public static void main(String[] args) {
        int loopCount = 100000;
        int count = 0;
        double x = 0.3;
        for (int i = 0; i < loopCount; i++) {
            if (xToPowerX2() < x){
                count++;
            }
        }
        System.out.println(Math.pow((double) x,(double) 2));
        System.out.println((double) count / (double) loopCount);
    }

    /**
     * 对于任意一个double类型的数N=Math.random，if要求N∈[0,X)，要求对应的概率为X^2
     */
    public static double xToPowerX2() {
        return Math.max(Math.random(),Math.random());
    }
}

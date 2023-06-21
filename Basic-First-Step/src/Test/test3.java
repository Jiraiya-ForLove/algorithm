package Test;

/**
 * @program: Basic-First-Step
 * @description:
 * @author: shenhaha
 * @create: 2023-06-15 17:56
 **/

public class test3 {
    public static void main(String[] args) {
        Runnable myRunnable = new myRunnable();
        Thread thread1 = new Thread(myRunnable, "线程1");
        Thread thread2 = new Thread(myRunnable, "线程2");
        thread1.setName("1线程");
        thread2.setName("2线程");
        thread1.start();
        thread2.start();
//        System.out.println(Thread.currentThread().getName());
    }
}

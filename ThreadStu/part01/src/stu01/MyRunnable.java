package stu01;

/**
 * @program: ThreadStu
 * @description:
 * @author: shenhaha
 * @create: 2023-04-05 20:03
 **/

public class MyRunnable implements Runnable{
    private int num = 10;
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
        System.out.println(num);
    }
}

class TestMyRunnable{
    public static void main(String[] args) {
        Runnable mr = new MyRunnable();
        Thread thread1 = new Thread(mr, "线程1");

        MyRunnable mr2 = new MyRunnable();
        Thread thread2 = new Thread(mr2, "线程2");
        thread1.start();
        thread2.start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName()+i);
                }
            }
        }).start();

        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
    }
}

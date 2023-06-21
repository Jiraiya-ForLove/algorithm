package stu01;

/**
 * @program: ThreadStu
 * @description:
 * @author: shenhaha
 * @create: 2023-04-05 19:32
 **/

public class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(getName() + "：正在执行！" + i);
        }
    }
}

class TestMyThread {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread("子线程1");
        MyThread thread2 = new MyThread("子线程2");
        Thread thread3 = new Thread("子线程3") {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + " " + i);
                }
            }
        };
        thread3.start();

        //开启子线程1
        thread1.start();
        //开启子线程2
        thread2.start();
        //开启子线程3
        for (int i = 0; i < 10; i++) {
            System.out.println("main线程！" + i);
        }
    }
}




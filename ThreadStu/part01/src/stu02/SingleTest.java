package stu02;

/**
 * @program: ThreadStu
 * @description:
 * @author: shenhaha
 * @create: 2023-04-08 20:16
 **/

public class SingleTest {
    public static void main(String[] args) {
        MyRunnable mr = new MyRunnable();
        Thread t1 = new Thread(mr, "线程1");
        Thread t2 = new Thread(mr, "线程2");
        t1.start();
        t2.start();
    }
}


class LayOne{
    private static LayOne layOne;
    //私有化构造器
    private LayOne(){};

    public static synchronized LayOne getLayOneInstance(){
        if (layOne == null){
            layOne = new LayOne();
        }
        return layOne;
    }
}

class MyRunnable implements Runnable{
    @Override
    public void run() {
        LayOne instance = LayOne.getLayOneInstance();
        System.out.println("当前线程"+Thread.currentThread().getName()+"获得的实例:"+instance);
    }
}

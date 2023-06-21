package Test;

/**
 * @program: Basic-First-Step
 * @description:
 * @author: shenhaha
 * @create: 2023-06-15 17:10
 **/

public class CountOperateTest {
    public static void main(String[] args) {
//        CountOperate countOperate = new CountOperate();//main线程调用构造方法
        //将自定义线程类的run方法给thread对象调用
        CountOperate thread = new CountOperate();
        //给thread对象设置name
        thread.setName("AAA");
        //启动thread对象
        thread.start();
    }
    //内部类
    public class test1{

    }
}

class CountOperate extends Thread {
    public CountOperate(){
        System.out.println("CountOperate --- begin");
        System.out.println("Thread.currentThread().getName() = "+Thread.currentThread().getName());
        System.out.println("this.getName()"+this.getName());//这个this指的是当前线程类
        System.out.println("CountOperate --- end");
    }

    @Override
    public void run() {
        System.out.println("run --- begin");
        System.out.println("Thread.currentThread.getName() = "+ Thread.currentThread().getName());
        System.out.println("this.getName()"+this.getName());
        System.out.println("run --- end ");
    }
}

package Test;

/**
 * @program: Basic-First-Step
 * @description:
 * @author: shenhaha
 * @create: 2023-06-15 17:54
 **/

public class test2 extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        System.out.println("======s");
        System.out.println(this.getName());
    }
}

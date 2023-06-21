package Test1;

import Test.threadLocalTest;

/**
 * @program: Basic-First-Step
 * @description:
 * @author: shenhaha
 * @create: 2023-06-15 19:58
 **/

public class OrderDao {
    public void f(){
        String name = Thread.currentThread().getName();
        System.out.println("OrderDao 方法中线程名为" + name + "的对应值为" + threadLocalTest.threadLocal.get());



    }
}

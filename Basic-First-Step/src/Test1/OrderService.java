package Test1;
import Test.threadLocalTest;

/**
 * @program: Basic-First-Step
 * @description:
 * @author: shenhaha
 * @create: 2023-06-15 18:48
 **/

public class OrderService {
    public void f1(){
        String name = Thread.currentThread().getName();
        System.out.println("OrderService方法中线程名为" + name + "的对应值为" + threadLocalTest.threadLocal.get());
        new OrderDao().f();
    }
}

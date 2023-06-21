package Test;

import Test1.OrderService;

import java.util.Hashtable;
import java.util.Map;
import java.util.Random;

/**
 * @program: Basic-First-Step
 * @description:
 * @author: shenhaha
 * @create: 2023-06-15 18:27
 **/

public class threadLocalTest {
    public static Map<String, Object> data = new Hashtable<>();
    private static Random random = new Random();

    //利用ThreadLocal来实现
    public static ThreadLocal<Object> threadLocal = new ThreadLocal<>();

    public static class threadTest implements Runnable {
        @Override
        public void run() {
            //获取一个随机的值
            int i = random.nextInt(100);
            String name = Thread.currentThread().getName();
            System.out.println("当前线程" + Thread.currentThread().getName() + "对应的值：" + i);
            threadLocal.set(i);

            new OrderService().f1();
            try {
                Thread.currentThread().sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            int i1 = (int) threadLocal.get();
            System.out.println("当前线程" + Thread.currentThread().getName() + "快结束时对应的值：" + i1);
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            new Thread(new threadTest(),"线程"+i).start();
        }
    }

}

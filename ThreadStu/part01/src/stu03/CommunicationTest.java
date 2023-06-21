package stu03;

/**
 * @program: ThreadStu
 * @description:
 * @author: shenhaha
 * @create: 2023-04-08 20:36
 **/

public class CommunicationTest {
    //创建2个线程，交替打印 1-100
    public static void main(String[] args) {
        Communication com = new Communication();
        Thread t1 = new Thread(com, "线程1");
        Thread t2 = new Thread(com, "线程2");
        t1.start();
        t2.start();
    }
}

class Communication implements Runnable{
    private int i = 1;
    @Override
    public void run() {
        while (true){
            //采用同步代码块的方式，锁的对象为当前对象。所以说要创建的多个线程必须以当前对象作为同一个锁
           synchronized (this){
               //同步代码块进来的时候，唤醒其他线程
               notify();
               if (i <= 100){
                   System.out.println(Thread.currentThread().getName() +":"+(i++));
               }else {
                   break;
               }

               try {
                   //执行过一次后，阻塞当前线程，释放当前锁，允许其他线程进来
                   wait();
               } catch (InterruptedException e) {
                   throw new RuntimeException(e);
               }

           }
        }
    }
}

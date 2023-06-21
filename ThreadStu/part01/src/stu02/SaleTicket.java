package stu02;

/**
 * @program: ThreadStu
 * @description:
 * @author: shenhaha
 * @create: 2023-04-07 19:58
 **/

public class SaleTicket {
    public static void main(String[] args) {
        Windows win1 = new Windows("窗口1");
        Windows win2 = new Windows("窗口2");
        Windows win3 = new Windows("窗口3");

//        win1.start();
//        win2.start();
//        win3.start();
        System.out.println(Thread.currentThread().getName());

    }
}


class Windows extends Thread{
    public  Windows(){

    }
    public Windows(String name){
        super(name);
    }

    @Override
    public void run() {
        int ticket = 100;
        for (int i = 100; i > 0; i--) {
            System.out.println(getName() + i);
        }
    }
}

package test01;

/**
 * @program: FaceToObject
 * @description: 饿汉式
 * @author: shenhaha
 * @create: 2023-03-30 19:53
 **/

public class Singleton {
    private Singleton(){

    }

    private static Singleton single = new Singleton();

    public static Singleton getInstance(){
        return single;
    }
}

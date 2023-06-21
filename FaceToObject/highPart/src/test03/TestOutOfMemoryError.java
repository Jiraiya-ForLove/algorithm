package test03;

import org.junit.Test;

import java.util.Scanner;

/**
 * @program: FaceToObject
 * @description:
 * @author: shenhaha
 * @create: 2023-03-31 21:11
 **/

public class TestOutOfMemoryError {
    @Test
    public void test02(){
        //OutOfMemoryError
        //方式一：
        int[] arr = new int[Integer.MAX_VALUE];
    }
    @Test
    public void test01(){
        //ClassCastException
        Object obj = 15;
        System.out.println(obj.getClass());
        String str = String.valueOf(obj);
        System.out.println(str);
    }
    @Test
    public void test03(){
        //NullPointerException
        int[][] arr = new int[3][];
        arr[0] = new int[5];
        System.out.println(arr[0].length);
    }

    @Test
    public void test04(){
        //ArrayIndexOutOfBoundsException
        int[] arr = new int[5];
        for (int i = 1; i <= 5; i++) {
            System.out.println(arr[i]);
        }
    }

    @Test
    public void test05(){
        //InputMismatchException
        Scanner input = new Scanner(System.in);
        System.out.print("请输入一个整数：");//输入非整数
        int num = input.nextInt();
        input.close();
    }
}

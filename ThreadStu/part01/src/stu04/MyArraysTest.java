package stu04;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @program: ThreadStu
 * @description:
 * @author: shenhaha
 * @create: 2023-04-13 20:22
 **/

public class MyArraysTest {
    public static void main(String[] args) {
        int[] arr = {3,2,5,1,4};
//		MyArrays.sort(arr);//错误的，因为int[]不是对象数组

        String[] strings = {"hello","sava","jong"};
        List<String> stringList = Arrays.asList(strings);
        Collections.sort(stringList);
        System.out.println(Arrays.toString(strings));

//        Circle[] circles = {new Circle(2.0),new Circle(1.2),new Circle(3.0)};
//        MyArrays.sort(circles); //编译通过，运行报错，因为Circle没有实现Comparable接口
    }
}


class MyArrays{

}

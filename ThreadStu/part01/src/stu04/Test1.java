package stu04;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: ThreadStu
 * @description:
 * @author: shenhaha
 * @create: 2023-04-13 21:28
 **/

public class Test1 {
    public Test1() {
    }

    @Test
    public void test1(){
        //List<Object> list1 = null;
        List<Person> list2 = new ArrayList<Person>();
        //List<Student> list3 = null;

        List<? extends Person> list4 = null;

        list2.add(new Person());
        list4 = list2;

        //读取：可以读
        Person p1 = list4.get(0);

        //写入：除了null之外，不能写入
//        list4.add(null);
//                list4.add(new Person());
//                list4.add(new Man());

    }


    @Test
    public void test2(){
        //List<Object> list1 = null;
        List<Person> list2 = new ArrayList<Person>();
        //List<Student> list3 = null;

        List<? super Person> list5 = null;
        list2.add(new Person());

        list5 = list2;

        //读取：可以实现
        Object obj = list5.get(0);

        //写入:可以写入Person及Person子类的对象
        list5.add(new Person());
        list5.add(new Man());

    }
}


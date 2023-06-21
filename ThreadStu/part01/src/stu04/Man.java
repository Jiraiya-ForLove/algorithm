package stu04;

/**
 * @program: ThreadStu
 * @description:
 * @author: shenhaha
 * @create: 2023-04-13 20:41
 **/

public class Man extends Person{

}

class GenericTest{
    public static void main(String[] args) {

        Person[] persons = null;
        Man[] mans = null;
        persons = mans;

        Person p = mans[0];//空指针异常
        System.out.println(p);//null
    }

}

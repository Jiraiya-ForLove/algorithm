package ListStu;

import org.junit.Test;

import java.util.LinkedList;

/**
 * @program: Month05
 * @description:
 * @author: shenhaha
 * @create: 2023-05-14 14:42
 **/

public class LinkedListTest {
    @Test
    public void test01(){
        LinkedList<String> strList = new LinkedList<String>();
        strList.add("a");
        strList.addFirst("b");
        System.out.println(strList);
        System.out.println(strList.getFirst());
    }
}

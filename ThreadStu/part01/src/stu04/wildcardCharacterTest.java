package stu04;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: ThreadStu
 * @description:
 * @author: shenhaha
 * @create: 2023-04-13 20:59
 **/

public class wildcardCharacterTest {
    public static void main(String[] args) {
        List<?> list = null;
        list = new ArrayList<String>();
        list = new ArrayList<Double>();
//         list.add(3);//编译不通过
        list.add(null);

        List<String> l1 = new ArrayList<String>();
        List<Integer> l2 = new ArrayList<Integer>();
        l1.add("尚硅谷");
        l2.add(15);
        read(l1);
        read(l2);
    }

    public static void read(List<?> list) {
        for (Object o : list) {
            System.out.println(o);
        }
    }

}

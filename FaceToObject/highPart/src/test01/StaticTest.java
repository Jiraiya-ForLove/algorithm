package test01;

/**
 * @program: FaceToObject
 * @description: 1
 * @author: shenhaha
 * @create: 2023-03-30 19:32
 **/

class Chinese{
    //实例变量
    String name;
    int age;
    //类变量
    static String nation;//国籍

    public Chinese() {
    }

    public Chinese(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Chinese{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", nation='" + nation + '\'' +
                '}';
    }
}
public class StaticTest {
    public static void main(String[] args) {
//        Chinese c1 = new Chinese("康师傅",36);
//        c1.nation = "中华人民共和国";
//
//        Chinese c2 = new Chinese("老干妈",66);
//
//        System.out.println(c1);
//        System.out.println(c2);
        Chinese.nation = "zhongguo";
        System.out.println(Chinese.nation);
    }
}


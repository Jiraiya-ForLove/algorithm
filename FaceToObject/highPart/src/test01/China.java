package test01;

/**
 * @program: FaceToObject
 * @description:
 * @author: shenhaha
 * @create: 2023-03-30 20:09
 **/

public class China {
//    private static String country = "中国";

    private static String country;
    private String name;

    {
        System.out.println("非静态代码块，country = " + country);
    }

    static {
        country = "中国";
        System.out.println("静态代码块");
    }

    public China(String name) {
        this.name = name;
    }
}

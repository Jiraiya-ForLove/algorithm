package test04;

/**
 * @program: FaceToObject
 * @description:
 * @author: shenhaha
 * @create: 2023-03-31 22:09
 **/

public class ExceptionTest {
    public static void main(String[] args) {
        int result = test();
        System.out.println(result); //100
    }

    public static int test(){
        int i = 100;
        try {
            return i;
        } finally {
            i++;
        }
    }
}


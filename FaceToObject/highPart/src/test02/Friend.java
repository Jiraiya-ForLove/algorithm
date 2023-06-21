package test02;

public interface Friend {
    default void date(){//约会
        System.out.println("吃喝玩乐");
    }
}

package chapter2;

/**
 * @author LiuYang
 * @date 2020/4/18
 */
public interface Aninmal {

    void eat();
    void run();

    default void breath(){
        System.out.println("所有动物都会呼吸");
    }

    static void cry(){
        System.out.println("叫声");
    }

}

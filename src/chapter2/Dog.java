package chapter2;

/**
 * @author LiuYang
 * @date 2020/4/18
 */
public class Dog implements Aninmal {



    @Override
    public void eat() {
        System.out.println("狗会吃");
    }

    @Override
    public void run() {
        System.out.println("狗会跑");
    }

}

package chapter3;

/**
 * @author LiuYang
 * @date 2020/4/19
 */
@FunctionalInterface
public interface OperFunction<T,R> {
    R operator(T t1,T t2);

}

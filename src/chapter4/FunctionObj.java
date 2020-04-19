package chapter4;

import java.util.function.Function;

/**
 * @author LiuYang
 * @date 2020/4/19
 */
public class FunctionObj implements Function {
    @Override
    public Object apply(Object o) {
        return o+"您已被杭州博彦录取！";
    }
}

import chapter4.Student;
import chapter5.User;
import chapter5.UserDTO;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author LiuYang
 * @date 2020/4/19
 */
public class MainStream {
    public static void main(String[] args) {
        /*jdk8新特性:流操作map和filter函数============================*/
//        List<String> list= Arrays.asList("小滴课堂","杭州博彦","杭州几禾科技");
//        List<String> result=list.stream().map(obj->obj+"欢迎你").collect(Collectors.toList());
//        System.out.println(result);

        /**
         * 场景： map转换对象，如javaweb开发中集合⾥里里⾯面的DO对象转换为DTO对象
         */
//        List<User> list=Arrays.asList(new User("娃哈哈1","123",77),new User("娃哈哈2","12345",97),
//                new User("娃哈哈","1234",78));
//        List<UserDTO> result=list.stream().map(obj->{
//            UserDTO userDTO=new UserDTO(obj.getName(),obj.getAge());
//            return userDTO;
//        }).collect(Collectors.toList());
//        System.out.println(result);
        /**
         * 场景：map转换对象，如javaweb开发中集合⾥里里⾯面的DO对象转换为DTO对象
         */


        /**
         * 需求：过滤出字符串串⻓长度⼤大于5的字符串串
         */
//        List<String> list=Arrays.asList("SpringBoot","1234","2342sfjksjdfksjdkf","杭州集合科技有限公司");
//        List<String> resultList=list.stream().filter(obj->obj.length()>5).collect(Collectors.toList());
//        System.out.println(resultList);
        /**
         * 需求：过滤出字符串串⻓长度⼤大于5的字符串串
         */
        /*jdk8新特性:流操作map和filter函数============================*/



        /*jdk8新特性:流stream⾥里里的limit和sorted函数的使⽤用============================*/
//        List<String> list = Arrays.asList("springboot", "springcloud111",
//                "redis", "git", "netty", "java", "ztml", "docker");
//        list.stream().sorted().collect(Collectors.toList());
//        System.out.println(list);
//
//        //根据长度进行排序
//        List<String> result=list.stream().sorted(Comparator.comparing(obj->obj.length())).collect(Collectors.toList
//        ());
//        System.out.println(result);
//
//        List<String> result1=list.stream().sorted(Comparator.comparing(String::length)).collect(Collectors.toList());
//        System.out.println(result);
//
//
//        List<String> result2=
//        list.stream().sorted(Comparator.comparing(String::length,Comparator.reverseOrder())).collect(Collectors
//        .toList());
//        System.out.println(result2);


//        //limt截取前几
//        List<String> result3
//                =list.stream().sorted(Comparator.comparing(String::length, Comparator.reverseOrder())).limit(3)
//                .collect(Collectors.toList());
//
//
//        System.out.println(result3);
        /*jdk8新特性:流stream⾥里里的limit和sorted函数的使⽤用============================*/


        /*jdk8新特性:流操作allMatch和anyMatch函数============================*/
//        //allMatch检查是否匹配所有元素，只有全部符合才返回true
//        boolean result=list.stream().allMatch(obj->obj.length()>5);
//        System.out.println(result);
//        //anyMatch检查是否⾄至少匹配⼀一个元素
//        boolean result1=list.stream().anyMatch(obj->obj.length()>5);
//        System.out.println(result1);
        /*jdk8新特性:流操作allMatch和anyMatch函数============================*/



        /*jdk8新特性:流stream⾥里里的max和min函数的使⽤用============================*/
//        List<User> users=Arrays.asList(new User(4),new User(5),new User(6),new User(10));
////        Optional<User> user =users.stream().max(Comparator.comparingInt(User::getAge));
//        Optional<User> user=users.stream().max((s1,s2)->{
//           return Integer.compare(s1.getAge(),s2.getAge());
//        });
////        User user1=user.get();
//          User user1=user.get();
//        System.out.println(user1.getAge());
        /*jdk8新特性:流stream⾥里里的max和min函数的使⽤用============================*/


        /*jdk8新特性:并行流parallelStream的使用============================*/
//        List<Integer> bunmbers = Arrays.asList(1, 2, 1, 2, 3, 4, 5, 6, 7, 7, 8, 8);
//        bunmbers.parallelStream().forEach(System.out::println);
//
//
//        for (int i=0;i<10;i++){
//            List<Integer> list=new CopyOnWriteArrayList<>();
//            IntStream.range(0,100).forEach(list::add);
//            System.out.println(list.size());
//        }
        /*jdk8新特性:并行流parallelStream的使用============================*/



        /*jdk8新特性:reduce操作,根据⼀一定的规则将Stream中的元素进⾏行行计算后返回⼀一个唯⼀一的值============================*/
//        Optional<Integer> a=Stream.of(1,23,4,56).reduce((item1, item2)->item1+item2);
//        System.out.println(a.get());


//        //常用方法二:T reduce(T identity, BinaryOperator<T> accumulator);
//        int value=Stream.of(1,2,3,4,5).reduce(100,(item1,item2)->item1+item2);
//        System.out.println(value);
        /*jdk8新特性:reduce操作,根据⼀一定的规则将Stream中的元素进⾏行行计算后返回⼀一个唯⼀一的值============================*/


        /*jdk8新特性:foreach循环不不能修改包含外部的变量量的值
不不能⽤用break或者return或者continue等关键词结束或者跳过循环============================*/


        /*jdk8新特性:收集器collectors的使用============================*/
//        List<String> list=Arrays.asList("111","222","22333333","111");
//        TreeSet<String> treeSet=list.stream().collect(Collectors.toCollection(TreeSet::new));
//        List<String> copyList=list.stream().collect(Collectors.toCollection(CopyOnWriteArrayList::new));
//        System.out.println(copyList);
//        System.out.println(treeSet);
        /*jdk8新特性:收集器collectors的使用============================*/


        /*jdk8新特性:joining的使用============================*/
//        List<String> list=Arrays.asList("123","SpringCloud","SpringBoot");
//        System.out.println(list.stream().collect(Collectors.joining()));
//        System.out.println(list.stream().collect(Collectors.joining(";")));
//        System.out.println(list.stream().collect(Collectors.joining(",","{","}")));
        /*jdk8新特性:joining的使用============================*/



    }


}

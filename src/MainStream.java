import chapter4.Student;
import chapter5.User;
import chapter5.UserDTO;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

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
         * 场景：map转换对象，如javaweb开发中集合⾥里里⾯面的DO对象转换为DTO对象
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

    }


}

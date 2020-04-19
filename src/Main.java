import chapter3.OperFunction;
import chapter4.FunctionObj;
import chapter4.Student;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class Main {

    public static void main(String[] args) throws UnsupportedEncodingException {
        /*jdk8新特性:default和静态方法可以写在接口中============================*/
//        Dog dog=new Dog();
//        dog.eat();
//        dog.run();
//        dog.breath();
//        Aninmal.cry();
        /*jdk8新特性:default和静态方法可以写在接口中============================*/





        /*jdk8新特性:Base64新编码类============================*/
//        Base64.Encoder encoder=Base64.getEncoder();
//        Base64.Decoder decoder=Base64.getDecoder();
//
//        String text="杭州博彦信息技术有限公司";
//        byte[] textByte=text.getBytes("UTF-8");
//
//
//        //编码
//        String encodedText=encoder.encodeToString(textByte);
//        System.out.println(encodedText);
//        //解码
//        System.out.println(new String(decoder.decode(encodedText),"UTF-8"));

        /*jdk8新特性:Base64新编码类============================*/


        /*jdk8新特性:日期处理类============================*/
//        LocalDate today=LocalDate.now();
        //获取年月日
//        System.out.println("今天日期:"+today);
//        System.out.println("今天是几月份:"+today.getMonth());
//        System.out.println("");
        /*jdk8新特性:日期处理类============================*/



        /*jdk8新特性:日期格式化线程安全DateTimeFormatter============================*/
//        LocalDateTime time=LocalDateTime.now();
//        System.out.println("日期:"+time);
////        SimpleDateFormat
//        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//        String ldtStr=dtf.format(time);
//        System.out.println(ldtStr);
        /*jdk8新特性:日期格式化线程安全DateTimeFormatter============================*/



        /*jdk8新特性:比较日期时间差============================*/
//        LocalDateTime today=LocalDateTime.now();
//        System.out.println(today);
//
//        //获取指定的日期时间
//        LocalDateTime changeDateTime=LocalDateTime.of(2020,10,3,12,20,20);
//        System.out.println(changeDateTime);
//
//        //比较两者日期的类Duration
//        Duration duration=Duration.between(today,changeDateTime);
//        System.out.println(duration.toDays());
//        System.out.println(duration.toHours());
//        System.out.println(duration.toNanos());
//        System.out.println(duration.toMinutes());
        /*jdk8新特性:比较日期时间差============================*/





        /*jdk8新特性:Optional类============================*/
//        Person person=null;
//        Person person=new Person();
        //of的参数是确定不为null的对象
//        Optional<Person> opt=Optional.of(person);
//       Optional<Person> opt=Optional.ofNullable(person);
//       if (opt.isPresent()){
//           System.out.println("Optional不为空");
//           Person person1=opt.get();
//           System.out.println(person1);
//       }else {
//           System.out.println("Optional为空");
//       }

//        //orElse的兜底做法
//        Person person=null;
//        Person person1=new Person(4);
//        Person result=Optional.ofNullable(person).orElse(person1);
//        System.out.println(result.getAge());


//        //函数式编程
//        Person person = null;
//        Person person1=new Person(20);
//        int result=Optional.ofNullable(person).map(obj->obj.getAge()).orElse(7);
//        int result1=Optional.ofNullable(person1).map(obj->obj.getAge()).orElse(7);
//        System.out.println(result);
//        System.out.println(result1);
        /*jdk8新特性:Optional类============================*/



        /*jdk8新特性:Lambda表达式============================*/

//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("杭州博彦信息技术有限公司");
//            }
//        }).start();
//        //线程的Lambda表达式
//        new Thread(()-> System.out.println("杭州博彦信息技术有限公司")).start();
//
//
//        List<String> list= Arrays.asList("aaa","bbb","cc","d");
//        //排序
//        Collections.sort(list, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.compareTo(o2);
//            }
//        });
//
//        for (String s:list){
//            System.out.println(s);
//        }
//
////        排序的Lambda表达式
////        lambda表达式 使⽤用场景(前提)：⼀一个接⼝口中只包含⼀一个⽅方法，则可以使⽤用Lambda表达式，这样
////        的接⼝口称之为“函数接⼝口” 语法： (params) -> expression
////        a,b参数类型是可以推断出来的，为了简洁，可以不写
//        Collections.sort(list,(a,b)->a.compareTo(b));
//        for (String s:list){
//            System.out.println(s);
//        }
//
//
//        new Thread(() -> {
//            System.out.println("杭州博彦信息技术有限公司");
//            System.out.println("加上{}代码块");
//        }).start();
        /*jdk8新特性:Lambda表达式============================*/



        /*jdk8新特性:自定义函数接口============================*/
//        System.out.println(operator(4,3,(a,b)->a+b));
//        System.out.println(operator(4,5,(a,b)->{
//            return a*b;
//        }));
        /*jdk8新特性:自定义函数接口============================*/


        /*jdk8新特性:函数型接⼝Function,有一个入参，有返回值============================*/
//        test("刘洋",new FunctionObj());
//
//
//        Function<Integer,Integer> function1=new Function<Integer, Integer>() {
//            @Override
//            public Integer apply(Integer integer) {
//                return integer*10;
//            }
//        };
//
//
//        Function<Integer,Integer> function=p->{
//            System.out.println("我是函数");
//           return p*1000;
//        };
//        System.out.println(function1.apply(10));;
        /*jdk8新特性:函数型接⼝Function,有一个入参，有返回值============================*/


        /*jdk8新特性:函数型接⼝BiFunction,传递两个参数,有返回值============================*/
        //使用定义的静态方法operator
//        System.out.println(operator(4,5,(x,y)->x+y));
//
//        //Lambda匿名方法
//        BiFunction<Integer,Integer,Integer> biFunction=(a,b)->a*b;
//        System.out.println(biFunction.apply(4,2));
        /*jdk8新特性:函数型接⼝BiFunction,传递两个参数,有返回值============================*/



        /*jdk8新特性:函数型接⼝BiFunction,消费型接⼝：有入参，无返回值============================*/
        //匿名内部类Lambda
//        Consumer<String> consumer=obj->{
//            System.out.println(obj);
//            System.out.println("发送短信或者打印日志");
//
//        };
//
//        consumer.accept("雷欧");
//        //定义好的方法
//        sendMessage("杭州博彦",consumer);
//
//
//        List<String> list= Arrays.asList("aaa","bbb","cc","d");
//        //forEach的参数是Consumer，可以使用函数式编程Lambda
//        list.forEach(obj-> System.out.println(obj));
        /*jdk8新特性:函数型接⼝BiFunction,消费型接⼝：有入参，无返回值============================*/



        /*jdk8新特性:Supplier: 供给型接⼝口：⽆无⼊入参，有返回值============================*/

//        Supplier<Student> supplier=()->{
//            Student student=new Student();
//            return student;
//        };

//        Supplier<Student> supplier = () -> {
//            Student student=new Student();
//            student.setName("朱竹青");
//            return student;
//        };
//
//
//
//
//        Student student = supplier.get();
//        System.out.println(student.getName());
//
//
//        Student student1=newStudent();
//        System.out.println(student1.getName());
        /*jdk8新特性:Supplier: 供给型接⼝：⽆无⼊入参，有返回值============================*/


        /*jdk8新特性:Predicate: 断⾔言型接⼝：有入参，有返回值，返回值类型确定是boolean============================*/

        List<String> list=Arrays.asList("asdfsdfasf","sdfsfsdfsdf","dsfasdfsdfa","aeerr3423423","sdfdfsbbbb");
        List<String> result=filter(list,obj->obj.startsWith("a"));
        System.out.println(list);
        System.out.println(result);

        /*jdk8新特性:Predicate: 断⾔言型接⼝：有入参，有返回值，返回值类型确定是boolean============================*/

    }

    /*jdk8新特性:Predicate: 断⾔言型接⼝：有入参，有返回值，返回值类型确定是boolean============================*/
    public static List<String> filter(List<String> list, Predicate<String> predicate){
        List<String> results=new ArrayList<>();
        list.forEach(str->{
         if (predicate.test(str)){
             results.add(str);
         }
        });
        return results;
    }
    /*jdk8新特性:Predicate: 断⾔言型接⼝口：有⼊入参，有返回值，返回值类型确定是boolean============================*/


    /*jdk8新特性:Supplier: 供给型接⼝口：⽆无⼊入参，有返回值============================*/
//    public static Student newStudent(){
//        Supplier<Student> supplier=()->{
//          Student student=new Student();
//          student.setName("唐三");
//          return student;
//        };
//        return supplier.get();
//    }
    /*jdk8新特性:Supplier: 供给型接⼝口：⽆无⼊入参，有返回值============================*/



    /*jdk8新特性:自定义函数接口============================*/
//    public static Integer operator(Integer a, Integer b, OperFunction<Integer,Integer> of){
//        return of.operator(a,b);
//    }
    /*jdk8新特性:自定义函数接口============================*/


    /*jdk8新特性:函数型接⼝Function,有一个入参，有返回值============================*/
//    public static void test(String input, FunctionObj functionObj){
//        System.out.println( functionObj.apply(input));
//    }
    /*jdk8新特性:函数型接⼝Function,有一个入参，有返回值============================*/


    /*jdk8新特性:函数型接⼝BiFunction,传递两个参数,有返回值============================*/
//    public static Integer operator(Integer a, Integer b, BiFunction<Integer,Integer,Integer> biFunction){
//        return biFunction.apply(a,b);
//    }
    /*jdk8新特性:函数型接⼝BiFunction,传递两个参数，有返回值============================*/


    /*jdk8新特性:函数型接⼝BiFunction,消费型接⼝：有入参，无返回值============================*/
//   public static void sendMessage(String msg, Consumer<String> consumer){
//       consumer.accept(msg);
//   }
    /*jdk8新特性:函数型接⼝BiFunction,消费型接⼝：有入参，无返回值============================*/

}

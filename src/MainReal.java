import chapter6.VideoOrder;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author LiuYang
 * @date 2020/4/23
 */
public class MainReal {
    public static void main(String[] args) {
        //总价 35
        List<VideoOrder> videoOrders1 = Arrays.asList(
                new VideoOrder("20190242812", "springboot教程", 3),
                new VideoOrder("20194350812", "微服务SpringCloud", 5),
                new VideoOrder("20190814232", "Redis教程", 9),
                new VideoOrder("20190523812", "⽹网⻚页开发教程", 9),
                new VideoOrder("201932324", "百万并发实战Netty", 9));
//总价 54
        List<VideoOrder> videoOrders2 = Arrays.asList(
                new VideoOrder("2019024285312", "springboot教程", 3),
                new VideoOrder("2019081453232", "Redis教程", 9),
                new VideoOrder("20190522338312", "⽹网⻚页开发教程", 9),
                new VideoOrder("2019435230812", "Jmeter压⼒力力测试", 5),
                new VideoOrder("2019323542411", "Git+Jenkins持续集成", 7),
                new VideoOrder("2019323542424", "Idea全套教程", 21));


        //交集
        List<VideoOrder> videoOrders =
                videoOrders1.stream().filter(obj -> videoOrders2.contains(obj)).collect(Collectors.toList());
        System.out.println(videoOrders.toString());

        //差集
        List<VideoOrder> videoOrders3 =
                videoOrders1.stream().filter(obj -> !videoOrders2.contains(obj)).collect(Collectors.toList());
        System.out.println("videoOrders1的差集" + videoOrders3);

        List<VideoOrder> videoOrders4 =
                videoOrders2.stream().filter(obj -> !videoOrders1.contains(obj)).collect(Collectors.toList());
        System.out.println("videoOrders2的差集" + videoOrders4);


        //并集
        List<VideoOrder> list = videoOrders1.stream().collect(Collectors.toList());
        list.addAll(videoOrders2);
        System.out.println(list);
        //去重并集
        List<VideoOrder> list1=list.stream().distinct().collect(Collectors.toList());
        System.out.println(list1);


        //订单平均价格
        double v1=videoOrders1.stream().collect(Collectors.averagingDouble(VideoOrder::getMoney));
        System.out.println(v1);

        double v2=videoOrders2.stream().collect(Collectors.averagingDouble(VideoOrder::getMoney));
        System.out.println(v2);

        //订单总价格
        int v3=videoOrders1.stream().collect(Collectors.summingInt(VideoOrder::getMoney));
        System.out.println(v3);

        int v4=videoOrders2.stream().collect(Collectors.summingInt(VideoOrder::getMoney));
        System.out.println(v4);


    }
}

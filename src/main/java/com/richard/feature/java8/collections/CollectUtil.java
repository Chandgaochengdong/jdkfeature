package com.richard.feature.java8.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Description TODO
 * @Author Richard
 * @Date 2019/10/18 17:46
 **/
public class CollectUtil {

    public static void main(String[] args) {
        //serial();
        //parallel();
        //middleOperate();
        endOperate();
    }

    /**
     *
     * 串行操作
     */
    public static void serial(){
        List<String> list = new ArrayList<String>();
        for(int i=0;i<1000000;i++){
            double d = Math.random()*1000;
            list.add(d+"");
        }
        long start = System.nanoTime();//获取系统开始排序的时间点
        int count= (int) ((Stream) list.stream().sequential()).sorted().count();

        long end = System.nanoTime();//获取系统结束排序的时间点
        long ms = TimeUnit.NANOSECONDS.toMillis(end-start);//得到串行排序所用的时间

        System.out.println("串行：" + ms+ "ms");
    }

    /**
     *
     * 并行操作
     */
    public static void parallel(){

        List<String> list = new ArrayList<String>();
        for(int i=0;i<1000000;i++){
            double d = Math.random()*1000;
            list.add(d+"");
        }
        long start = System.nanoTime();//获取系统开始排序的时间点
        int count = (int)((Stream) list.stream().parallel()).sorted().count();
        long end = System.nanoTime();//获取系统结束排序的时间点
        long ms = TimeUnit.NANOSECONDS.toMillis(end-start);//得到并行排序所用的时间
        System.out.println( "并行： " +  ms+ "ms");

    }

    /**
     * 返回流本身 stream
     */
    public static void middleOperate(){
        List<String> list = Arrays.asList("Tom","Lily","sili","Lily");
        //filter()：对元素进行过滤；
        list.stream().filter((t)->{
            if(t.indexOf("s") != - 1){
                return false;
            }
            return true;
        }).forEach((String a) ->{
            System.out.println(a);
        });

        //sorted()：对元素排序；
        System.out.println(" 排序中间操作 ");
        list.stream().sorted();
        System.out.println(Arrays.toString(list.toArray()));
        //map()：元素的映射；
        System.out.println(" map 中间操作 ");
        List<String> nlist = new ArrayList<>();
        nlist = list.stream().map((t)->{
            if(t.equals("Lily")){
                return t;
            }else{
                return null;
            }
        }).collect(Collectors.toList());
        System.out.println(Arrays.toString(nlist.toArray()));

        //distinct()：去除重复元素；
        System.out.println(" distinct 中间操作 ");
        nlist = list.stream().distinct().collect(Collectors.toList());
        System.out.println(Arrays.toString(nlist.toArray()));
        //subStream()：获取子 Stream 等

    }

    /**
     * 不能在继续往下操作
     *
     */
    public static void endOperate(){
        //forEach()：对每个元素做处理；
        List<String> list = Arrays.asList("Tom","Lily","sili","Lily");


        //toArray()：把元素导出到数组；
        System.out.println(Arrays.toString(list.stream().toArray()));

        // findFirst()：返回第一个匹配的元素；
        System.out.println(list.stream().findFirst().get());
        // anyMatch()：是否有匹配的元素等。

        System.out.println(list.stream().parallel().anyMatch(t->t.equals("Lily")));

    }
}

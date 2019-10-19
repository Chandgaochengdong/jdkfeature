package com.richard.feature.java8.date;

import java.time.*;

/**
 * @Description TODO
 * @Author Richard
 * @Date 2019/10/19 9:53
 **/
public class DateTest {

    /**
     *
     * Java 的日期与时间 API 问题由来已久，Java 8 之前的版本中关于时间、日期及其他时间日期格式化类由于线程安全、重量级、序列化成本高等问题而饱受批评。Java 8 吸收了 Joda-Time 的精华，以一个新的开始为 Java 创建优秀的 API。新的 java.time 中包含了所有关于时钟（Clock），本地日期（LocalDate）、本地时间（LocalTime）、本地日期时间（LocalDateTime）、时区（ZonedDateTime）和持续时间（Duration）的类。历史悠久的 Date 类新增了 toInstant() 方法，用于把 Date 转换成新的表示形式。这些新增的本地化时间日期 API 大大简化了了日期时间和本地化的管理。
     */
    public static void main(String[] args) {
        //LocalDate
        LocalDate localDate = LocalDate.now(); //获取本地日期
        localDate = LocalDate.ofYearDay(2014, 200); // 获得 2014 年的第 200 天
        System.out.println(localDate.toString());//输出：2014-07-19
        localDate = LocalDate.of(2014, Month.SEPTEMBER, 10); //2014 年 9 月 10 日
        System.out.println(localDate.toString());//输出：2014-09-10
//LocalTime
        LocalTime localTime = LocalTime.now(); //获取当前时间
        System.out.println(localTime.toString());//输出当前时间
        localTime = LocalTime.of(10, 20, 50);//获得 10:20:50 的时间点
        System.out.println(localTime.toString());//输出: 10:20:50
//Clock 时钟
        Clock clock = Clock.systemDefaultZone();//获取系统默认时区 (当前瞬时时间 )
        long millis = clock.millis();//

        LocalDateTime dateTime = LocalDateTime.now();

        System.out.println(dateTime.toString());

        Duration d =  Duration.between(dateTime,LocalDateTime.now());
        System.out.println(d.getSeconds());
    }
}

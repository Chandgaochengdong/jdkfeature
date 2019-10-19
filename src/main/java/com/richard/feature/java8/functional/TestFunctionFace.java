package com.richard.feature.java8.functional;

/**
 * @Description TODO
 * @Author Richard
 * @Date 2019/10/18 17:06
 *
 *
 * 。如果一个接口定义个唯一一个抽象方法，那么这个接口就成为函数式接口。同时，
 * 引入了一个新的注解：@FunctionalInterface。可以把他它放在一个接口前，
 * 表示这个接口是一个函数式接口。这个注解是非必须的，只要接口只包含一个方法的接口，
 * 虚拟机会自动判断，不过最好在接口上使用注解 @FunctionalInterface 进行声明。在接口中添加了 @FunctionalInterface 的接口，只允许有一个抽象方法，否则编译器也会报错。
 **/
@FunctionalInterface
public interface TestFunctionFace {

     abstract void myFunction();

}

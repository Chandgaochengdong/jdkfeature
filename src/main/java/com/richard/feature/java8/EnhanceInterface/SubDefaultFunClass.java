package com.richard.feature.java8.EnhanceInterface;

/**
 * @Description TODO
 * @Author Richard
 * @Date 2019/10/18 17:41
 **/
public class SubDefaultFunClass implements DefaultFunInterface {

    public static void main(String[] args) {
        SubDefaultFunClass funClass = new SubDefaultFunClass();
        int count = funClass.count();
        System.out.println(count);

        System.out.println(DefaultFunInterface.find());
    }
}

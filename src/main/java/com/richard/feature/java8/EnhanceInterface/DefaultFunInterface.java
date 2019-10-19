package com.richard.feature.java8.EnhanceInterface;

/**
 * @Description TODO
 * @Author Richard
 * @Date 2019/10/18 17:37
 **/
public interface DefaultFunInterface {

    default int count(){
        return 1;
    }


    public static int find(){
        return 2;
    }
}
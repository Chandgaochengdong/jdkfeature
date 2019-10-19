package com.richard.feature.java8.lambda;

import java.util.function.Function;

/**
 * @Description TODO
 * @Author Richard
 * @Date 2019/10/18 17:10
 **/
public class LambdaMain {

    public static void main(String[] args) {
        Thread thread = new Thread(()->{
            System.out.println(" I am runing");
        });
        thread.start();

        Function<Integer,String> function = new Function<Integer, String>() {
            @Override
            public String apply(Integer integer) {
                return null;
            }
        };

        Function<Integer,String> function2 = (t)->{

            return null;
        };

        Function<Integer,String> function3 = String::valueOf;



    }

    public static String getFun(){

        return null;
    }
}
